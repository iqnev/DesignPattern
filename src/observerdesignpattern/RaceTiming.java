/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerdesignpattern;

import java.util.ArrayList;

/**
 *
 * @author iqnev
 */
public class RaceTiming implements Subject{
    
    private ArrayList<Observer> observers;
    private float time;
    private int lap;
    
    public RaceTiming() {
        this.observers = new ArrayList<Observer>();
    }
    @Override
    public void register(Observer o) {
        if(o == null)  throw new NullPointerException("Null Observer");
        this.observers.add(o);
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void unregister(Observer o) {
        int observerIndex = this.observers.indexOf(o);
        System.out.println("Observer " + (observerIndex+1) + " deleted");
        this.observers.remove(observerIndex);
        
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers) {
            observer.update(this.time, this.lap);
        }
        
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    public void setTime(float time) {
        this.time = time;
        
        notifyObserver();
    }
    
    public void setLap(int lap) {
        this.lap = lap;
        notifyObserver();
    }
   
}
