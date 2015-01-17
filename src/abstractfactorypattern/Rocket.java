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
public class Rocket extends Ship{
    /**
     * Constructor.
     */
    public Rocket() {
        setDamage(10.00);
        setNeme("Rocket");
        
        construct();
    }
    
    protected void construct() {
        System.out.println("Building rocket ship");      
    }
}
