package Commands;

import Interfaces.CommandInterface;
import UserSystem.Aggregator;

public class CMDGetCurrentMenu implements CommandInterface{
    
    private Aggregator agg;
    
    public CMDGetCurrentMenu(Aggregator agg){
        this.agg = agg;
    }

    @Override
    public Object execute() {
        return agg.getCurrentMenu();
    }
    
    
}
