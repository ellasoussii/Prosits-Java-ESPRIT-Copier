
package tn.esprit.gestionzoo.entities;

public class Zoo {

    private Aquatic[] aquaticAnimals = new Aquatic[10];
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

    public void addAquaticAnimal(Aquatic aquatic) {
        for (int i = 0; i < aquaticAnimals.length; i++) {
            if (aquaticAnimals[i] == null) {
                aquaticAnimals[i] = aquatic;
                return;
            }
        }

        System.out.println("The aquatic animals array is full!");
    }



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


    public void displayAquaticAnimals() {
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic != null) {
                aquatic.swim();
            }
        }
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


    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;

        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Penguin) {
                Penguin penguin = (Penguin) aquatic;

                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }

        return maxDepth;
    }


    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Dolphin) {
                dolphinCount++;
            } else if (aquatic instanceof Penguin) {
                penguinCount++;
            }
        }

        System.out.println("Number of dolphins: " + dolphinCount);
        System.out.println("Number of penguins: " + penguinCount);
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
