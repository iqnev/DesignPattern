/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorydesignpattern;

/**
 *
 * @author iqnev
 */
public abstract class Ship {
    private String name;
    private double speed;
    private double damage;
    
    public void setNeme(String newName) {
        name = newName;
    }
    
    public String getName() {
        return name;
    }
    
     public void setDamage(Double newDamage) {
        damage = newDamage;
    }
    
    public double getDamage() {
        return damage;
    }
    
}
