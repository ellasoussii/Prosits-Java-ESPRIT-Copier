
package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Terrestrial;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.Zoo;

public class ZooManagement {

    public static void main(String[] args) {

        // Create a terrestrial animal
        Terrestrial terrestrial = new Terrestrial(
                "Mammal", "Lion", 5, true, 4
        );

        // Create aquatic animals
        Dolphin dolphin1 = new Dolphin(
                "Mammal", "Flipper", 8, true, "Ocean", 25.5f
        );

        Dolphin dolphin2 = new Dolphin(
                "Mammal", "Dolly", 6, true, "Ocean", 20.0f
        );

        Penguin penguin1 = new Penguin(
                "Bird", "Pingu", 3, false, "Antarctica", 200.0f
        );

        Penguin penguin2 = new Penguin(
                "Bird", "Penny", 4, false, "Antarctica", 300.0f
        );

        // Create a zoo
        Zoo zoo = new Zoo("MyZoo", "Bizerte", 20);

        // Add aquatic animals to the zoo
        zoo.addAquaticAnimal(dolphin1);
        zoo.addAquaticAnimal(dolphin2);
        zoo.addAquaticAnimal(penguin1);
        zoo.addAquaticAnimal(penguin2);

        // Instruction 23: Display the objects
        System.out.println(terrestrial);
        System.out.println(dolphin1);
        System.out.println(dolphin2);
        System.out.println(penguin1);
        System.out.println(penguin2);

        // Instruction 27: Make all aquatic animals swim
        System.out.println("\n--- Aquatic animals swimming ---");
        zoo.displayAquaticAnimals();

        // Instruction 29: Display maximum penguin swimming depth
        System.out.println("\n--- Maximum penguin swimming depth ---");
        System.out.println(zoo.maxPenguinSwimmingDepth());

        // Instruction 30: Display the number of aquatic animals by type
        System.out.println("\n--- Number of aquatic animals by type ---");
        zoo.displayNumberOfAquaticsByType();

        // Instruction 31: Test equals()
        Dolphin dolphin3 = new Dolphin(
                "Mammal", "Flipper", 8, true, "Ocean", 30.0f
        );

        System.out.println("\n--- Testing equals() ---");
        System.out.println(dolphin1.equals(dolphin3));
    }
}
