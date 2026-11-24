
package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {

        try {

            // Create an Aquatic reference using a Dolphin object
            Aquatic aquatic = new Dolphin(
                    "Mammal", "Flipper", 8, true, "Ocean", 25.5f
            );

            // Create a Penguin
            Penguin penguin = new Penguin(
                    "Bird", "Pingu", 3, false, "Antarctica", 200.0f
            );

            // Create a Terrestrial animal
            Terrestrial terrestrial = new Terrestrial(
                    "Mammal", "Lion", 5, true, 4
            );

            // Test Carnivore interface
            System.out.println("--- Aquatic animal ---");
            aquatic.eatMeat(Food.MEAT);

            System.out.println("\n--- Penguin ---");
            penguin.eatMeat(Food.MEAT);

            // Test Omnivore interface
            System.out.println("\n--- Terrestrial animal ---");

            terrestrial.eatMeat(Food.MEAT);
            terrestrial.eatPlant(Food.PLANT);
            terrestrial.eatPlantAndMeet(Food.BOTH);

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
