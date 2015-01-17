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
public class Ufo extends Ship{
    public Ufo() {
        setNeme("Ufo");
        setDamage(12.44);
        
        construct();
    }
    
    protected void construct() {
        System.out.println("Building ufo ship");      
    }
}
