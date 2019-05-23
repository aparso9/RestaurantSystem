package Commands;

import Interfaces.CommandInterface;
import TableRelated.TablePopulater;
import UserSystem.Aggregator;

public class CMDPopulateTables implements CommandInterface{

    private TablePopulater tablePopulater;
    private Aggregator agg;
    
    public CMDPopulateTables(Aggregator agg){
        tablePopulater = new TablePopulater();
        this.agg = agg;
    }
    
    @Override
    public Object execute() {
        agg.setTables(tablePopulater.populate());
        return agg.getTables();
    }

}
