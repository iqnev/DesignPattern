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
public class Tank implements Prototype{
    String name;
    
    public Tank(String name) {
        this.name = name;
    }
    @Override
    public Prototype doClone(String name) {
        return new Tank(name);
    }
    
      public String toString() {
        return "The tank's name is:"+name;
    }
    
}
