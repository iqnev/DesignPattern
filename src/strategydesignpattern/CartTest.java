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
public class CartTest {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        
        Item item1 = new Item("1234", (float) 12.4);
        Item item2 = new Item("0890", (float) 1.09);
        
        cart.addItem(item2);
        cart.addItem(item1);
        
        cart.pay(new PaypalStrategy("qnev89@gmail.com", "123456789"));
        cart.pay(new CreditCardStrategy("1234567890123456", "123", "4/20", "Iqnev"));
    }
}
