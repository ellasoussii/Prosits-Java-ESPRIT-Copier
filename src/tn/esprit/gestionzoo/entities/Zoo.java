
package tn.esprit.gestionzoo.entities;

public class Zoo {

    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Zoo name cannot be empty.");
        }

        if (nbrCages < 0 || nbrCages > 25) {
            throw new IllegalArgumentException(
                    "Number of cages must be between 0 and 25."
            );
        }

        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];
    }

    // Instruction 17: Add an animal
    public boolean addAnimal(Animal animal) {
        if (animal == null || isZooFull()) {
            return false;
        }

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                return true;
            }
        }

        return false;
    }

    // Instruction 15: Check if the zoo is full
    public boolean isZooFull() {
        for (Animal animal : animals) {
            if (animal == null) {
                return false;
            }
        }

        return true;
    }

    // Instruction 16: Compare two zoos
    public static Zoo compareZoo(Zoo z1, Zoo z2) {
        int count1 = 0;
        int count2 = 0;

        for (Animal animal : z1.animals) {
            if (animal != null) {
                count1++;
            }
        }

        for (Animal animal : z2.animals) {
            if (animal != null) {
                count2++;
            }
        }

        if (count1 > count2) {
            return z1;
        } else if (count2 > count1) {
            return z2;
        } else {
            return null;
        }
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getNbrCages() {
        return nbrCages;
    }
}
