/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpattern;

/**
 *
 * @author iqnev
 */
public class TestBuilderPattern {
    public static void main(String[] args) {
      User user1 = new User.UserBuilder("Lokesh", "Gupta")
    .age(30)
    .phone("1234567")
    .address("Fake address 1234")
    .build();
      
      System.out.println(user1);
    }
}
