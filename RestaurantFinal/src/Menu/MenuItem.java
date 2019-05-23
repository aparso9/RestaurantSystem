package Menu;

import java.text.DecimalFormat;
import java.util.concurrent.atomic.AtomicInteger;

public class MenuItem 
{
    private static final AtomicInteger count = new AtomicInteger(0);
    private int id;
    private String item;
    private double price;
    private DecimalFormat df;
    
    public MenuItem(String item, double price){
        id = count.incrementAndGet();
        this.item = item;
        this.price = price;
        df = new DecimalFormat("$##.00");
    }
    
    public int getID(){
        return id;
    }
    
    public String getItem(){
        return item;
    }
    
    public double getPrice(){
        return price;
    }
    
    @Override
    public String toString(){
        return String.format("# %s %-30s %s",id,item,df.format(price));
    }
}
