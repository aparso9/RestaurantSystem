package Subjects;

import Interfaces.Observer;
import Interfaces.Subject;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class CurrentTime implements Subject{
    
    private ArrayList<Observer> observers;
    private Date date;
    private String timeString;
    private int time;
    
    public CurrentTime(){
        observers = new ArrayList();
    }

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);        
        System.out.println("Observer " + (observerIndex + 1) + " deleted");
        
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObservers() {
        
        observers.forEach((observer) -> {
            observer.update();
        });
    }
    
    public int getTime(){
        DateFormat df = new SimpleDateFormat("HH"); //uses a 24 hour system to check what time of the day it is to consider what menu to call.
        date = new Date();
        timeString = df.format(date);
        time = Integer.parseInt(timeString);
        return time;
    }
    
    public String status(){
        String status;
        if(time < 8 || time > 23){
            status = "closed";
        }
        else{
            status = "open for business.";
        }
        return status;
    }

}
