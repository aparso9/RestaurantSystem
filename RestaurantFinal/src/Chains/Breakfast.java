package Chains;

import Builder.BreakfastMenuBuilder;
import Interfaces.ChainInterface;
import Interfaces.MenuBuilderInterface;

public class Breakfast implements ChainInterface{

    private ChainInterface nextChain;
    
    @Override
    public void setNextChain(ChainInterface nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public MenuBuilderInterface breakfastLunchOrDinner(int time) {
        if(time <= 11){
            return new BreakfastMenuBuilder();
        }
        else{
           return nextChain.breakfastLunchOrDinner(time);
        }
    }

}
