package Menu;

import Interfaces.MenuInterface;
import java.util.ArrayList;

public class CurrentMenu implements MenuInterface{

    private ArrayList<MenuItem> menu;
    private String head;
    private String foot;
    
    public CurrentMenu(){
        menu = new ArrayList();
        head = "";
        foot = "";
    }

    @Override
    public String addItem(MenuItem mi) {
        menu.add(mi);
        return mi + " added";
    }

    @Override
    public String removeItem(MenuItem mi) {
        menu.remove(mi);
        return mi + " removed";
    }

    @Override
    public int length() {
        return menu.size();
    }

    @Override
    public MenuItem getMenuItem(int index) {
        return menu.get(index);
    }

    @Override
    public void setHeading(String head) {
        this.head = head;
    }

    @Override
    public void setFooter(String foot) {
        this.foot = foot;
    }

    @Override
    public String getHeading() {
        return head;
    }

    @Override
    public String getFooter() {
        return foot;
    }

    @Override
    public void print() {
        System.out.println(head +"\n");
        
        for(int i = 0; i < menu.size(); i++){
            System.out.println(menu.get(i));
        }
        
        System.out.println("\n" + foot);
    }
    
}
