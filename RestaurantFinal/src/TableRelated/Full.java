package TableRelated;

import Interfaces.TableState;

public class Full implements TableState{

    private Table table;
    
    public Full(Table table){
        this.table = table;
    }
    
    @Override
    public void seatCustomer() {
        System.out.println("Table is full");
    }

    @Override
    public void seatsEmptied() {
        System.out.println("Table " + table.getID() + " is free for use");
        table.setOpenSeats(4);
        table.setTableState(table.getHasSpaceState());
    }
}
