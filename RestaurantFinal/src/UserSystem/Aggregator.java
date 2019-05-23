package UserSystem;

import Menu.CurrentMenu;
import Menu.Orders;
import TableRelated.Tables;

public class Aggregator 
{
    private CurrentMenu menu;
    private Orders orders;
    private Tables tables;
    
    public Aggregator(CurrentMenu menu, Orders orders){
        this.menu = menu;
        this.orders = orders;
    }
    
    public void setCurrentMenu(CurrentMenu menu){
        this.menu = menu;
    }
    
    public void setOrders(Orders orders){
        this.orders = orders;
    }
    
    public void setTables(Tables tables){
        this.tables = tables;
    }
    
    public CurrentMenu getCurrentMenu(){
        return menu;
    }
    
    public Orders getOrders(){
        return orders;
    }
    
    public Tables getTables(){
        return tables;
    }
}