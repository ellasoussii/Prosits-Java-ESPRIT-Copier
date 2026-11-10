
package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {

        try {

            // Create a zoo with only 3 cages
            Zoo zoo = new Zoo("MyZoo", "Bizerte", 3);

            // Create four terrestrial animals
            Terrestrial lion = new Terrestrial(
                    "Mammal", "Lion", 5, true, 4
            );

            Terrestrial tiger = new Terrestrial(
                    "Mammal", "Tiger", 6, true, 4
            );

            Terrestrial elephant = new Terrestrial(
                    "Mammal", "Elephant", 10, true, 4
            );

            Terrestrial monkey = new Terrestrial(
                    "Mammal", "Monkey", 3, true, 2
            );

            // Add animals and display the number after each attempt
            try {
                zoo.addAnimal(lion);
                System.out.println("Number of animals: " + zoo.getNbrAnimals());
            } catch (ZooFullException e) {
                System.out.println(e.getMessage());
                System.out.println("Number of animals: " + zoo.getNbrAnimals());
            }

            try {
                zoo.addAnimal(tiger);
                System.out.println("Number of animals: " + zoo.getNbrAnimals());
            } catch (ZooFullException e) {
                System.out.println(e.getMessage());
                System.out.println("Number of animals: " + zoo.getNbrAnimals());
            }

            try {
                zoo.addAnimal(elephant);
                System.out.println("Number of animals: " + zoo.getNbrAnimals());
            } catch (ZooFullException e) {
                System.out.println(e.getMessage());
                System.out.println("Number of animals: " + zoo.getNbrAnimals());
            }

            try {
                zoo.addAnimal(monkey);
                System.out.println("Number of animals: " + zoo.getNbrAnimals());
            } catch (ZooFullException e) {
                System.out.println(e.getMessage());
                System.out.println("Number of animals: " + zoo.getNbrAnimals());
            }

            // Test InvalidAgeException
            Terrestrial invalidAnimal = new Terrestrial(
                    "Mammal", "Invalid Animal", -2, true, 4
            );

        } catch (InvalidAgeException e) {
            System.out.println("Invalid age: " + e.getMessage());
        }

    }
}
