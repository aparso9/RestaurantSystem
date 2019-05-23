package Builder;

import Interfaces.MenuBuilderInterface;
import Menu.CurrentMenu;

public class MenuBuilderDirector {
    
    private MenuBuilderInterface menuBuilder;
    
    public MenuBuilderDirector(MenuBuilderInterface menuBuilder){
        this.menuBuilder = menuBuilder;
    }
    
    public CurrentMenu getCurrentMenu(){
        return menuBuilder.getCurrentMenu();
    }
    
    public void makeMenu(){
        menuBuilder.addHeading();
        menuBuilder.addMenuItems();
        menuBuilder.addFooter();
    }
}
