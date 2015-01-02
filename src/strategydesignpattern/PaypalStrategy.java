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
public class PaypalStrategy implements PaymentStrategy{
    
    private String email;
    private String password;
    
    /**
     * 
     * @param email
     * @param password 
     */
    public PaypalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Paypal.");
    }
}
