package UserSystem;

import Menu.CurrentMenu;
import Menu.Orders;
import Observers.RestaurantClosedObserver;
import Subjects.CurrentTime;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SystemInterface {

    private static Invoker inv;
    private static int partySize;
    
    public static void init(Invoker inv, CurrentTime ct){
        SystemInterface.inv = inv;
        inv.CreateMenu();
        inv.populateTables();
        RestaurantClosedObserver rco = new RestaurantClosedObserver(ct);
        //ct.notifyObservers();
        if(rco.isClosed()){
            System.out.println("Restaurant is currently closed. Please try again between the hours of 8 A.M. and 11 P.M. when our place of business is operating");
            System.exit(0);
        }
        else{
            inv.setTime(ct);
        }
    }
    
    public static void BeSeated(){
        if(inv.getOpenTables().isEmpty()){
            System.out.println("All tables currently full. Please try again later");
            System.exit(0);
        }
        
        Scanner k = new Scanner(System.in);
        System.out.println("How many people in your party?");
        partySize = k.nextInt();
        
        if(partySize <= 0){
            System.out.println("Party size not valid");
            System.exit(0);
        }
        
        if(partySize % 4 != 0 || partySize / 4 > inv.getOpenTables().size()){
            if(inv.getOpenTables().size() < ((partySize / 4) + 1)){ //4 seats to a table and integer division has to account for extra table if partySize is in between 2 multiples of 4
                System.out.println("Not enought tables to fit your party. Our apologies. Please try again at a different time");
                System.exit(0);
            }
        }
        
        inv.seatTable(partySize);
    }
    
    public static void DisplayMenu(){
        CurrentMenu menu = inv.getCurrentMenu();
        menu.print();
    }
    
    public static void SubmitOrder(){
        Scanner k = new Scanner(System.in);
        int choice = 1;
        while(choice >= 0){
            try{
                System.out.println("Press number corresponding to menu item or press -1 to complete order: ");
                choice = k.nextInt();
                choice--;
                if(choice >= 0 && choice < inv.getCurrentMenu().length()){
                    inv.placeOrder(choice);
                }
                else if(choice == -2){}
                else{
                    System.out.println("Item does not exist, please try again.");
                    k.nextLine();
                }
            }
            catch(InputMismatchException e){
                System.out.println("Please enter a valid input.\n");
                k.nextLine();
            }
        }
        
        System.out.println("Order Submitted\n");
    }
    
    public static void DisplayTab(){
        Orders orders = inv.getTab();
        double total = 0;
        DecimalFormat df = new DecimalFormat("$##.00");
        
        if(orders.length() == 0){
            System.out.println("No tab to display");
        }
        else{
            System.out.println("\nYour tab is : \n");
            for(int i = 0; i < orders.length(); i++){
                System.out.println(orders.getOrderItem(i));
                total += orders.getOrderItem(i).getPrice();
            }
            System.out.println("\nTotal : " + df.format(total) + "\n");
        }
    }
    
    public static void PayBill(){
        Orders orders = inv.getTab();
        
        
        orders.clear();
    }
    
    public static void FreeUsedTables(){
        inv.clearTables(partySize);
    }
}
