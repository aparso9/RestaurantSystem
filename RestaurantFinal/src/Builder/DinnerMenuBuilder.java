package Builder;

import Interfaces.MenuBuilderInterface;
import Menu.CurrentMenu;
import Menu.MenuItem;

public class DinnerMenuBuilder implements MenuBuilderInterface{

    private CurrentMenu menu;
    
    public DinnerMenuBuilder(){
        menu = new CurrentMenu();
    }
    
    @Override
    public void addHeading() {
        menu.setHeading("Dinner is Served");
    }

    @Override
    public void addMenuItems() {
        MenuItem mi0 = new MenuItem("Prime Rib",20.99);
        MenuItem mi1 = new MenuItem("Pork Chops",16.99);
        MenuItem mi2 = new MenuItem("Buttermilk Chicken Sandwich",10.99);
        MenuItem mi3 = new MenuItem("Mac and Cheese",4.99);
        MenuItem mi4 = new MenuItem("Buffalo Wings",9.99);
        
        menu.addItem(mi0);
        menu.addItem(mi1);
        menu.addItem(mi2);
        menu.addItem(mi3);
        menu.addItem(mi4);
    }

    @Override
    public void addFooter() {
        menu.setFooter("Have a Delightful Evening!");
    }

    @Override
    public CurrentMenu getCurrentMenu() {
        return menu;
    }

}
