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
public class ShipFactory {

    /**
     * Create ship factory
     * @param model
     * @param kind
     * @return the factory instance of {@code Ship}
     */
    public static Ship buildShip(ShipType model, TypeEnum kind) {
        Ship ship = null;
        switch (kind) {
            case HUMAN:
                ship = HumanShip.buildShip(model);
                break;
            case ALIEN:
                ship = AlienShip.buildShip(model);
                break;
            default:
                break;
        }

        return ship;
    }
}
