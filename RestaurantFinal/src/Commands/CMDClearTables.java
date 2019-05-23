package Commands;

import Interfaces.CommandInterface;
import UserSystem.Aggregator;

public class CMDClearTables implements CommandInterface{

    private Aggregator agg;
    private int partySize;
    
    public CMDClearTables(Aggregator agg, int partySize){
        this.agg = agg;
        this.partySize = partySize;
    }
    
    @Override
    public Object execute() {
        int numTablesToFree;
        
        if(partySize % 4 == 0){
            numTablesToFree = partySize / 4;
        }
        else{
            numTablesToFree = (partySize / 4) + 1;
        }
        
        for(int i = 0; i < numTablesToFree; i++){
            agg.getTables().getTable(i).seatsEmptied();
        }
        
        return agg.getTables().getOpenTables();
    }

}
