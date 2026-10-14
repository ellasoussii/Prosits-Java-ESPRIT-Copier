
public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages;
    private int nbrAnimals;

    public Zoo(String name, String city, int nbrCages) {
        if (nbrCages < 1 || nbrCages > 25) {
            throw new IllegalArgumentException(
                    "The number of cages must be between 1 and 25."
            );
        }

        this.animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.nbrAnimals = 0;
    }

    public void displayZoo() {
        System.out.println("Zoo name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of cages: " + nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                ", nbrAnimals=" + nbrAnimals +
                '}';
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].name.equalsIgnoreCase(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean addAnimal(Animal animal) {
        if (animal == null || searchAnimal(animal) != -1) {
            return false;
        }

        if (nbrAnimals >= nbrCages) {
            return false;
        }

        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    public void displayAnimals() {
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);

        if (index == -1) {
            return false;
        }

        for (int i = index; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }

        animals[nbrAnimals - 1] = null;
        nbrAnimals--;

        return true;
    }
}
