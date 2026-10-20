
package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Terrestrial;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;

public class ZooManagement {

    public static void main(String[] args) {

        Aquatic aquatic = new Aquatic(
                "Fish", "Nemo", 2, false, "Ocean"
        );

        Terrestrial terrestrial = new Terrestrial(
                "Mammal", "Lion", 5, true, 4
        );

        Dolphin dolphin = new Dolphin(
                "Mammal", "Flipper", 8, true, "Ocean", 25.5f
        );

        Penguin penguin = new Penguin(
                "Bird", "Pingu", 3, false, "Antarctica", 200.0f
        );

        // Instruction 23: Display the objects
        System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);

        // Instruction 24: Call swim()
        aquatic.swim();
        dolphin.swim();
        penguin.swim();
    }
}
