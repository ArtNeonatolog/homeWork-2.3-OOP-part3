package animals;

import java.util.Objects;

public class Amphibians extends Animals {
    private String habitat;

    public Amphibians(String name, int birthYear, String habitat) {
        super(name, birthYear);
        if (habitat != null && !habitat.isEmpty() && !habitat.isBlank()) {
            this.habitat = habitat;
        } else {
            this.habitat = "водоем";}
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if (habitat != null && !habitat.isEmpty() && !habitat.isBlank()) {
            this.habitat = habitat;
        } else {
            this.habitat = "водоем";}
    }

    @Override
    public void eat() {
        System.out.println("Земноводные питаются преимущественно насекомыми и другими беспозвоночными");

    }

    @Override
    public void sleep() {

    }

    @Override
    public void move() {
        System.out.println("На суше и в воде земноводные передвигаются с помощью двух пар конечностей");
    }

    private void hunt () {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return habitat.equals(that.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat);
    }

    @Override
    public String toString() {
        return "Amphibians{" +
                "habitat='" + habitat + '\'' +
                "} " + super.toString();
    }

    public void informationOfAmphibians () {
        System.out.println("Кличка животного - " + getName() + ", возраст - " + getBirthYear() + " лет"
                + ", среда обитания - " + getHabitat());
    }
}
