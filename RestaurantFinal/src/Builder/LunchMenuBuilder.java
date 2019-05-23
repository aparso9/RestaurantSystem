package Builder;

import Interfaces.MenuBuilderInterface;
import Menu.CurrentMenu;
import Menu.MenuItem;

public class LunchMenuBuilder implements MenuBuilderInterface {

    private CurrentMenu menu;
    
    public LunchMenuBuilder(){
        menu = new CurrentMenu();
    }
    
    @Override
    public void addHeading() {
        menu.setHeading("Lunch is Served");
    }

    @Override
    public void addMenuItems() {
        MenuItem mi0 = new MenuItem("Fettucine Alfredo",13.99);
        MenuItem mi1 = new MenuItem("Italian Cold Cut Sub",6.99);
        MenuItem mi2 = new MenuItem("Cheeseburger",9.99);
        MenuItem mi3 = new MenuItem("Chicken Tenders",9.99);
        MenuItem mi4 = new MenuItem("Baby Back Ribs",13.99);
        
        menu.addItem(mi0);
        menu.addItem(mi1);
        menu.addItem(mi2);
        menu.addItem(mi3);
        menu.addItem(mi4);
    }

    @Override
    public void addFooter() {
        menu.setFooter("Have a Delightful Afternoon!");
    }

    @Override
    public CurrentMenu getCurrentMenu() {
        return menu;
    }

}
