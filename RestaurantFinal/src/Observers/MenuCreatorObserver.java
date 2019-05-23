package Observers;

import Chains.*;
import Interfaces.ChainInterface;
import Interfaces.MenuBuilderInterface;
import Interfaces.Observer;
import Subjects.CurrentTime;

public class MenuCreatorObserver implements Observer {

    private CurrentTime currentTime;
    private int time;
    
    public MenuCreatorObserver(CurrentTime currentTime){
        this.currentTime = currentTime;
        currentTime.register(this);
    }
    @Override
    public void update() {
        this.time = currentTime.getTime();
    }
    
    public MenuBuilderInterface buildMenu(){
        ChainInterface breakfast = new Breakfast();
        ChainInterface lunch = new Lunch();
        ChainInterface dinner = new Dinner();
        
        breakfast.setNextChain(lunch);
        lunch.setNextChain(dinner);
        
        currentTime.notifyObservers();
        
        return breakfast.breakfastLunchOrDinner(time);
    }

}
