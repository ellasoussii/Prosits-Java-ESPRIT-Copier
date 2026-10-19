
package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class ZooManagement {

    public static void main(String[] args) {

        Animal lion = new Animal("Feline", "Simba", 5, true);
        Animal tiger = new Animal("Feline", "Tiger", 4, true);

        Zoo myZoo = new Zoo("Friguia Park", "Hammamet", 10);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(tiger);
    }
}
