package TableRelated;

import Interfaces.TableState;

public class HasSpace implements TableState{

    private Table table;
    
    public HasSpace(Table table){
        this.table = table;
    }
    
    @Override
    public void seatCustomer() {
        if(table.getOpenSeats() == 1){
            table.setTableState(table.getFullState());
        }
        else{
            table.setOpenSeats(table.getOpenSeats()-1);
        }
    }

    @Override
    public void seatsEmptied() {
        switch (table.getOpenSeats()) {
            case 4:
                System.out.println("Table was already empty");
                break;
            default:
                System.out.println("Table " + table.getID() + " is free for use");
                table.setOpenSeats(4);
                break;
        }
    }

}
