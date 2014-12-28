/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerdesignpattern;

/**
 *
 * @author iqnev
 */
public class RaceObserver implements Observer{
    private float time;
    private int lap;
    
    private static int observerIDTracker = 0;
    private int observerID;
    private Subject riceTiming;
    
    public RaceObserver(Subject riceTiming) {
        this.riceTiming = riceTiming; 
        this.observerID = ++observerIDTracker;
        System.out.println("New Observer " + this.observerID);
        this.riceTiming.register(this);
    }
    @Override
    public void update(float time, int lap) {
        this.lap = lap;
        this.time = time;
        printTheTime();
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void printTheTime() {
        System.out.println(observerID + "\nLap: " + this.lap + "\nTime: " + this.time + "\n");
    }
    
}
