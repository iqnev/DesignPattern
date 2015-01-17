/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorypattern;


/**
 *
 * @author iqnev
 */
public class ShipTest {
    public static void main(String[] args) {
        System.out.println(ShipFactory.buildShip(ShipType.UFO, TypeEnum.ALIEN));
        System.out.println(ShipFactory.buildShip(ShipType.ROCKET, TypeEnum.ALIEN));
        System.out.println(ShipFactory.buildShip(ShipType.SHUTTLE, TypeEnum.HUMAN));
    }
}
