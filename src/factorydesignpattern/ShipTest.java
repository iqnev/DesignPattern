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
public class ShipTest {
    public static void main(String[] args) {
        System.out.println(ShipFactory.buildShip(ShipType.UFO));
        System.out.println(ShipFactory.buildShip(ShipType.ROCKET));
        System.out.println(ShipFactory.buildShip(ShipType.SHUTTLE));
    }
}
