package Menu;

public class OrderItem 
{
    private MenuItem menuItem;
    
    public OrderItem(MenuItem mi){
        menuItem = mi;
    }
    
    public int getID(){
        return menuItem.getID();
    }
    
    public String getItem(){
        return menuItem.getItem();
    }
    
    public double getPrice(){
        return menuItem.getPrice();
    }
    
    @Override
    public String toString(){
        return menuItem.toString();
    }
}