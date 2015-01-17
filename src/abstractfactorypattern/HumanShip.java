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
public class HumanShip {
    
    /**
     * Create Human ship type
     * @param model
     * @return the factory instance of {@code Ship}
     */
    public static Ship buildShip(ShipType model) {
        Ship ship = null;
        switch (model) {
            case ROCKET:
                ship = new Rocket();
                break;
            case SHUTTLE:
                ship = new Shuttle();
                break;
            case UFO:
                ship = new Ufo();
                break;
            default:
                break;
        }

        return ship;
    }
}
