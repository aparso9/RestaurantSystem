package Commands;

import Interfaces.CommandInterface;
import TableRelated.Table;
import UserSystem.Aggregator;

public class CMDSeatTable implements CommandInterface{
    
    private Aggregator agg;
    private int partySize;
    
    public CMDSeatTable(Aggregator agg, int partySize){
        this.agg = agg;
        this.partySize = partySize;
    }
    
    public Table getOpenTable(){
        return agg.getTables().getOpenTables().get(0);
    }
    
    @Override
    public Object execute(){
        Table table = getOpenTable();
        while(partySize != 0){
            if(table.getCurrentTableState() == table.getFullState()){
                table = getOpenTable();
            }
            
            table.seatCustomer();
            partySize--;
        }
        
        return table;
    }
}
