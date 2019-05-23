package UserSystem;

import java.util.Scanner;

public class UserInterface {
    
    public UserInterface(){
        
    }
    
    public void start(){
        Scanner k = new Scanner(System.in);
        int choice = 0;
        
        System.out.println("Welcome to our restaurant! Would you like to be seated?"
                + "\n1) Yes"
                + "\n2) No");
        choice = k.nextInt();
        
        if(choice == 1){
            SystemInterface.BeSeated();
        }
        if(choice == 2){
            System.out.println("Thank you for stopping by. We hope you have a wonderful rest of your day!");
            System.exit(0);
        }
                
        choice = 0;
        while(choice < 5){
            System.out.println("Please press the button corresponding to the action you'd like to take:"
                    + "\n1) Display Menu"
                    + "\n2) Submit Order"
                    + "\n3) Display Tab"
                    + "\n4) Clear Tab"
                    + "\n5) Quit");
            choice = k.nextInt();
        
            switch(choice){
                case 1:{
                    SystemInterface.DisplayMenu();
                    break;
                }
                case 2:{
                    SystemInterface.SubmitOrder();
                    break;
                }
                case 3:{
                    SystemInterface.DisplayTab();
                    break;
                }
                case 4:{
                    SystemInterface.PayBill();
                }
            }
        }
        
        SystemInterface.FreeUsedTables();
        
        System.out.println("Thank you very much for your time. We hope you have a wonderful rest of your day!");
    }
}
