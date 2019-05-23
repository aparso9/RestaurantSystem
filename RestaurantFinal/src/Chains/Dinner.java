package Chains;

import Builder.DinnerMenuBuilder;
import Interfaces.ChainInterface;
import Interfaces.MenuBuilderInterface;

public class Dinner implements ChainInterface{

    private ChainInterface nextChain;
    
    @Override
    public void setNextChain(ChainInterface nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public MenuBuilderInterface breakfastLunchOrDinner(int time) {
            return new DinnerMenuBuilder();
    }
}
