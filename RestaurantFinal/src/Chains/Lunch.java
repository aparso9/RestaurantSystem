package Chains;

import Builder.LunchMenuBuilder;
import Interfaces.ChainInterface;
import Interfaces.MenuBuilderInterface;

public class Lunch implements ChainInterface{
    
    private ChainInterface nextChain;
    
    @Override
    public void setNextChain(ChainInterface nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public MenuBuilderInterface breakfastLunchOrDinner(int time) {
        if(time <= 16){
            return new LunchMenuBuilder();
        }
        else{
            return nextChain.breakfastLunchOrDinner(time);
        }
    }
}
