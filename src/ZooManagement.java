
public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal("Feline", "Simba", 5, true);

        Zoo myZoo = new Zoo("My Zoo", "Tunis", 3);

        myZoo.addAnimal(lion);
    }
}
