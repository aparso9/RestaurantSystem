package Commands;

import Builder.MenuBuilderDirector;
import Factory.MenuFactory;
import Interfaces.CommandInterface;
import UserSystem.Aggregator;
import Menu.CurrentMenu;
import Subjects.CurrentTime;

public class CMDCreateMenu implements CommandInterface{
    
    private Aggregator agg;
    private MenuFactory mf;
    private CurrentTime ct;
    
    public CMDCreateMenu(Aggregator agg, CurrentTime ct){
        this.agg = agg;
        mf = new MenuFactory();
        this.ct = ct;
    }
    
    public void create(){
        CurrentMenu menu = mf.getMenu(ct);
        agg.setCurrentMenu(menu);
    }

    @Override
    public Object execute() {
        create();
        return agg.getCurrentMenu();
    }
    
    
}
