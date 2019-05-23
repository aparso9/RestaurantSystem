package Commands;

import Interfaces.CommandInterface;
import UserSystem.Aggregator;
import Menu.OrderItem;

public class CMDPlaceOrder implements CommandInterface{
    
    private Aggregator agg;
    private int menuItemNum;
    
    public CMDPlaceOrder(Aggregator agg, int menuItemNum){
        this.agg = agg;
        this.menuItemNum = menuItemNum;
    }
    
    @Override
    public Object execute() {
        OrderItem oi = new OrderItem(agg.getCurrentMenu().getMenuItem(menuItemNum));
        agg.getOrders().addItem(oi);
        return oi;
    }
}
