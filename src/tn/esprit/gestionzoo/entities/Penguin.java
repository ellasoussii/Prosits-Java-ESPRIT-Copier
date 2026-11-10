
package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.entities.InvalidAgeException;
public class Penguin extends Aquatic {



    private float swimmingDepth;

    public Penguin(String family, String name, int age,
                   boolean isMammal, String habitat,
                   float swimmingDepth)
    throws InvalidAgeException{
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return "Penguin{" + super.toString()
                + ", swimmingDepth=" + swimmingDepth + "}";
    }


    @Override
    public void swim() {
        System.out.println("This penguin is swimming");
    }


    public float getSwimmingDepth() {
        return swimmingDepth;
    }

}
