package Commands;

import Interfaces.CommandInterface;
import UserSystem.Aggregator;

public class CMDGetOpenTables implements CommandInterface{

    private Aggregator agg;
    
    public CMDGetOpenTables(Aggregator agg){
        this.agg = agg;
    }
    
    @Override
    public Object execute() {
        return agg.getTables().getOpenTables();
    }

}
