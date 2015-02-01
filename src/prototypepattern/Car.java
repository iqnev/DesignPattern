/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypepattern;

/**
 *
 * @author iqnev
 */
public class Car implements Prototype{
    String model;
    
    public Car(String model) {
        this.model = model;
    }

    @Override
    public Prototype doClone(String model) {
       return new Car(model);
    }
    
    public String toString() {
        return "This model of the car is:" +model;
    }
    
}
