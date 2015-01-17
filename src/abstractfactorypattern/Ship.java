/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorypattern;

import factorydesignpattern.*;

/**
 *
 * @author iqnev
 */
public abstract class Ship {
    private String name;
    private double speed;
    private double damage;
    
    /**
     * Set name of the ship
     * @param newName 
     */
    public void setNeme(String newName) {
        name = newName;
    }
    
    /**
     * 
     * @return name 
     */
    public String getName() {
        return name;
    }
    
    /**
     * Set dame of the ship
     * @param newDamage 
     */
     public void setDamage(Double newDamage) {
        damage = newDamage;
    }
    
     /**
      * 
      * @return demage
      */
    public double getDamage() {
        return damage;
    }
    
}
