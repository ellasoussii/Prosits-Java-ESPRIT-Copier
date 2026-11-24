
package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal implements Omnivore<Food> {
    private int nbrLegs;

    public Terrestrial(String family, String name, int age,
                       boolean isMammal, int nbrLegs)
    throws InvalidAgeException
    {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    @Override
    public String toString() {
        return "Terrestrial{" + super.toString()
                + ", nbrLegs=" + nbrLegs + "}";
    }



    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT) {
            System.out.println("This terrestrial animal eats meat.");
        } else {
            System.out.println("Invalid food for eatMeat.");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT) {
            System.out.println("This terrestrial animal eats plants.");
        } else {
            System.out.println("Invalid food for eatPlant.");
        }
    }

    @Override
    public void eatPlantAndMeet(Food food) {
        if (food == Food.BOTH) {
            System.out.println("This terrestrial animal eats meat and plants.");
        } else {
            System.out.println("Invalid food for eatPlantAndMeet.");
        }
    }

}
