
package tn.esprit.gestionzoo.entities;

import java.util.Objects;


public abstract class Aquatic extends Animal {
    private String habitat;

    public Aquatic(String family, String name, int age,
                   boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    @Override
    public String toString() {
        return "Aquatic{" + super.toString()
                + ", habitat=" + habitat + "}";
    }


    public abstract void swim();


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Aquatic other = (Aquatic) obj;

        return getAge() == other.getAge()
                && Objects.equals(getName(), other.getName())
                && Objects.equals(habitat, other.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), habitat);
    }


}
