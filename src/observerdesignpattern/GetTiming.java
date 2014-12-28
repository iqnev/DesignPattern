/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerdesignpattern;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iqnev
 */
public class GetTiming implements Runnable {

    private float time;
    private int lap;
    private RaceTiming raceTiming;

    public GetTiming(Subject raceTiming, int lap, float time) {
        this.raceTiming = (RaceTiming) raceTiming;
        this.time = time;
        this.lap = lap;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(GetTiming.class.getName()).log(Level.SEVERE, null, ex);
            }

            float minX = 50.0f;
            float maxX = 100.0f;
            Random rand = new Random();
            float finalTIME = rand.nextFloat() * (maxX - minX) + minX;
            
            raceTiming.setLap(i);
            raceTiming.setTime(finalTIME);
        }
    }

}
