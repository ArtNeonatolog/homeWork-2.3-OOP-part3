package animals;

import java.util.Objects;

public class Flying extends Birds {

    private final String movementType;

    public Flying(String name, int birthYear, String habitat, String movementType) {
        super(name, birthYear, habitat);
        if (movementType != null && !movementType.isEmpty() && !movementType.isBlank()) {
            this.movementType = movementType;
        } else {
            this.movementType = "полет";}
    }

    public String getMovementType() {
        return movementType;
    }

    @Override
    public void hunt() {
        System.out.println("Летающие птицы охотятся на рыбу, мелких грызунов, мелких животных, других птиц");

    }

    private void fly () {
        System.out.println("Летающие птицы летают на разной высоте, с разной скоростью продолжительное время");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flying)) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return movementType.equals(flying.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementType);
    }

    @Override
    public String toString() {
        return "Flying{" +
                "movementType='" + movementType + '\'' +
                "} " + super.toString();
    }

    public void informationOfFlyingBirds () {
        System.out.println("Кличка птицы - " + getName() + ", возраст - " + getBirthYear() + " лет"
                + ", среда обитания - " + getHabitat() + ", тип передвижения - " + getMovementType());
    }
}
