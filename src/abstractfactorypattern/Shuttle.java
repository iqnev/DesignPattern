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
public class Shuttle extends Ship{
    public Shuttle() {
        setDamage(20.00);
        setNeme("Shuttle");
        
        construct();
    }
    
    protected void construct() {
        System.out.println("Building rocket shuttle");      
    }
}
