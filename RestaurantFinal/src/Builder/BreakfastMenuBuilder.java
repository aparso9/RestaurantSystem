package Builder;

import Interfaces.MenuBuilderInterface;
import Menu.CurrentMenu;
import Menu.MenuItem;

public class BreakfastMenuBuilder implements MenuBuilderInterface{

    private CurrentMenu menu;
    
    public BreakfastMenuBuilder(){
        menu = new CurrentMenu();
    }
    
    @Override
    public void addHeading() {
        menu.setHeading("Breakfast is Served");
    }

    @Override
    public void addMenuItems() {
        MenuItem mi0 = new MenuItem("Eggs",4.99);
        MenuItem mi1 = new MenuItem("Pancakes",8.99);
        MenuItem mi2 = new MenuItem("Waffles",8.99);
        MenuItem mi3 = new MenuItem("Bacon",4.99);
        MenuItem mi4 = new MenuItem("Sausage",3.99);
        
        menu.addItem(mi0);
        menu.addItem(mi1);
        menu.addItem(mi2);
        menu.addItem(mi3);
        menu.addItem(mi4);
    }

    @Override
    public void addFooter() {
        menu.setFooter("Have a Delightful Morning!\n");
    }

    @Override
    public CurrentMenu getCurrentMenu() {
        return menu;
    }

}
