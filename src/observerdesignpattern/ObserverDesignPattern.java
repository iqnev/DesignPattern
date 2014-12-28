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
public class ObserverDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       RaceTiming raceTiming = new RaceTiming();
       
       RaceObserver observer1 = new RaceObserver(raceTiming);
       raceTiming.setLap(12);
       raceTiming.setTime((float) 12.3);
       
       Runnable getRacing = new GetTiming(raceTiming, 1, (float) 12.3);
       
       new Thread(getRacing).start();
       
    }
    
}
