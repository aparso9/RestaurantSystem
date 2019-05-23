package TableRelated;

import Interfaces.TableState;
import java.util.concurrent.atomic.AtomicInteger;

public class Table {

    private TableState hasSpace;
    private TableState full;
    
    private TableState tableState;
    private int openSeats = 4;
    private int id;
    private static final AtomicInteger count = new AtomicInteger(0);
    
    public Table(){
        id = count.incrementAndGet();
        hasSpace = new HasSpace(this);
        full = new Full(this);
        
        tableState = hasSpace;
        
        if(openSeats < 0){
            tableState = full;
        }
    }
    
    public void setTableState(TableState newTableState){
        tableState = newTableState;
    }
    
    public void setOpenSeats(int openSeats){
        this.openSeats = openSeats;
    }
    
    public void seatCustomer(){
        tableState.seatCustomer();
    }
    
    public void seatsEmptied(){
        tableState.seatsEmptied();
    }
    
    public int getOpenSeats(){
        return openSeats;
    }
    
    public TableState getCurrentTableState(){
        return tableState;
    }
    
    public TableState getHasSpaceState(){
        return hasSpace;
    }
    
    public TableState getFullState(){
        return full;
    }
    
    public int getID(){
        return id;
    }
    
    @Override
    public String toString(){
        if(openSeats > 1){
            return "Table # " + id + " with " + openSeats + " open seats";
        }
        else{
            return "Table # " + id + " with " + openSeats + " open seat";
        }
    }
}
