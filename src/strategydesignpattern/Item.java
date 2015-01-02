/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategydesignpattern;

/**
 *
 * @author iqnev
 */
public class Item {
    private String code;
    private float price;
    
    /**
     * 
     * @param code
     * @param price 
     */
    public Item(String code, float price) {
        this.price = price;
        this.code = code;
    }
    
    /**
     * 
     * @return price of {@code Item}
     */
    public float getPrice() {
        return price;
    }
    
    /**
     * 
     * @return code of {@code Item}
     */
    public String getCode() {
        return code;
    }
}
