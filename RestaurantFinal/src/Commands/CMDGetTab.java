package Commands;

import Interfaces.CommandInterface;
import UserSystem.Aggregator;

public class CMDGetTab implements CommandInterface{
    
    private Aggregator agg;
    
    public CMDGetTab(Aggregator agg){
        this.agg = agg;
    }
    
    @Override
    public Object execute() {
        return agg.getOrders();
    }
}
