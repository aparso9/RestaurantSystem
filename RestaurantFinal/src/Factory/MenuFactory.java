package Factory;

import Builder.*;
import Interfaces.MenuBuilderInterface;
import Interfaces.MenuFactoryInterface;
import Menu.CurrentMenu;
import Observers.MenuCreatorObserver;
import Subjects.CurrentTime;

public class MenuFactory implements MenuFactoryInterface{
        
    @Override
    public CurrentMenu getMenu(CurrentTime ct) {
        MenuCreatorObserver menuUpdateObserver = new MenuCreatorObserver(ct);        
        MenuBuilderInterface menuBuilderInterface = (MenuBuilderInterface)menuUpdateObserver.buildMenu();
        MenuBuilderDirector menuBuilderDirector = new MenuBuilderDirector(menuBuilderInterface);
        
        
        menuBuilderDirector.makeMenu();
        
        
        return menuBuilderDirector.getCurrentMenu();
    }
}
