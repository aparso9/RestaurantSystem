package Observers;

import Interfaces.Observer;
import Subjects.CurrentTime;

public class RestaurantClosedObserver implements Observer{

    private CurrentTime ct;
    private boolean isClosed;
    
    public RestaurantClosedObserver(CurrentTime ct){
        this.ct = ct;
        ct.register(this);
        isClosed = false;
    }
    
    
    @Override
    public void update() {      
        if(ct.status().equalsIgnoreCase("closed")){
            isClosed = true;
        }
        else{
            isClosed = false;
        }
    }
    
    public boolean isClosed(){
        return isClosed;
    }

}
