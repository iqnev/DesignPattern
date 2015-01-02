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
public class CreditCardStrategy implements PaymentStrategy{
    
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExp;
    
    /**
     *
     * @param ccNum
     * @param cvv
     * @param dateOfExp
     * @param name
     */
    public CreditCardStrategy(String ccNum, String cvv, String dateOfExp, String name) {
        this.name=name;
        this.cardNumber=ccNum;
        this.cvv=cvv;
        this.dateOfExp=dateOfExp;

    }
    
    @Override
    public void pay(int amount) {
       System.out.println(amount +" paid with credit card!");

    }
    
}
