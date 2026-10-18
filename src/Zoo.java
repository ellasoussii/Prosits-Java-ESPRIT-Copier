

public class Zoo {
    Animal[] animals;
    String name;
    String city;
    final int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        if (nbrCages < 0 || nbrCages > 25) {
            throw new IllegalArgumentException(
                    "The number of cages must be between 0 and 25."
            );
        }

        this.animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }


    public boolean isZooFull() {
        int count = 0;

        for (Animal animal : animals) {
            if (animal != null) {
                count++;
            }
        }

        return count == nbrCages;
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


}
