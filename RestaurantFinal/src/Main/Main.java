package Main;

import UserSystem.Aggregator;
import UserSystem.UserInterface;
import UserSystem.SystemInterface;
import Menu.Orders;
import Menu.CurrentMenu;
import Subjects.CurrentTime;
import UserSystem.Invoker;

public class Main {
    public static void main(String[] args){
        CurrentMenu menu = new CurrentMenu();
        Orders orders = new Orders();
        Aggregator agg = new Aggregator(menu,orders);
        Invoker invoker = new Invoker(agg);
        CurrentTime currentTime = new CurrentTime();
        SystemInterface.init(invoker,currentTime);
        UserInterface ui = new UserInterface();
        
        ui.start();
        
    }
}
