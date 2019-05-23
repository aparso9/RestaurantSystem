package Menu;

import java.util.ArrayList;
import java.util.List;

public class Orders 
{
    private List<OrderItem> order;
    
    public Orders(){
        order = new ArrayList<>();
    }
    
    public String addItem(OrderItem oi){
        order.add(oi);
        return oi.toString() + " added";
    }
    
    public String removeItem(OrderItem oi){
        order.remove(oi);
        return oi.toString() + " removed";
    }
    
    public int length(){
        return order.size();
    }
    
    public OrderItem getOrderItem(int index){
        return order.get(index);
    }
    
    public void clear(){
        order = new ArrayList<>();
    }
}