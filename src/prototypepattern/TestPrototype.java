/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypepattern;

/**
 *
 * @author iqnev
 */
public class TestPrototype {
    public static void main(String[] args) {
        Car car1 = new Car("X5");
        System.out.println("car1:"+car1);
        
        Car car2 = (Car)car1.doClone("Z8");
        System.out.println("car2:"+car2);
        
        
        Tank tank1 = new Tank("Leopard 2");
        System.out.println("tank1:"+tank1);
        
        Tank tank2 = (Tank)tank1.doClone("T-72");
        System.out.println("tank2:"+tank2);
    }
}
