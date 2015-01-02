/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategydesignpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iqnev
 */
public class ShoppingCart {
    List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }
    
    /**
     * 
     * @param item 
     */
    public void addItem(Item item) {
        this.items.add(item);
    }
    
    /**
     * 
     * @param item 
     */
    public void removeItem(Item item) {
        this.items.remove(item);
    }
    
    /**
     * 
     * @return totalsum
     */
    public float calculateTotal() {
        int sum = 0;
        
        for(Item item : items) {
            sum +=item.getPrice();
        }
        
        return sum;
    }
    
    public void pay(PaymentStrategy paymentMethod) {
        int amount = (int) calculateTotal();
        paymentMethod.pay(amount);
    }
}
