package UserSystem;

import Commands.*;
import Interfaces.CommandInterface;
import Menu.CurrentMenu;
import Menu.OrderItem;
import Menu.Orders;
import Subjects.CurrentTime;
import TableRelated.Table;
import TableRelated.Tables;
import java.util.ArrayList;

public class Invoker {

    private Aggregator agg;
    private CommandInterface ci;
    private CurrentTime ct;
    
    public Invoker(Aggregator agg){
        this.agg = agg;
        ct = new CurrentTime();
    }
    
    public Tables populateTables(){
        ci = new CMDPopulateTables(agg);
        return (Tables)ci.execute();
    }
    
    public Table seatTable(int partySize){
        ci = new CMDSeatTable(agg, partySize);
        return (Table)ci.execute();
    }
    
    public ArrayList<Table> getOpenTables(){
        ci = new CMDGetOpenTables(agg);
        return (ArrayList<Table>)ci.execute();
    }
    
    public CurrentMenu getCurrentMenu(){
        ci = new CMDGetCurrentMenu(agg);
        return (CurrentMenu)ci.execute();
    }
    
    public CurrentMenu CreateMenu(){
        ci = new CMDCreateMenu(agg, ct);
        return (CurrentMenu)ci.execute();
    }
    
    public Orders getTab(){
        ci = new CMDGetTab(agg);
        return (Orders)ci.execute();
    }
    
    public OrderItem placeOrder(int menuItemNum){
        ci = new CMDPlaceOrder(agg,menuItemNum);
        return (OrderItem)ci.execute();
    }
    
    public void setTime(CurrentTime ct){
        this.ct = ct;
    }
    
    public ArrayList<Table> clearTables(int partySize){
        ci = new CMDClearTables(agg, partySize);
        return (ArrayList<Table>)ci.execute();
    }
}
