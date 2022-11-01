package animals;

import java.util.Objects;

public class FlightLess extends Birds {

    private String movementType;

    public FlightLess(String name, int birthYear, String habitat, String movementType) {
        super(name, birthYear, habitat);
        if (movementType != null && !movementType.isEmpty() && !movementType.isBlank()) {
            this.movementType = movementType;
        } else {
            this.movementType = "бег";}
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        if (movementType != null && !movementType.isEmpty() && !movementType.isBlank()) {
            this.movementType = movementType;
        } else {
            this.movementType = "бег";}
    }

    @Override
    public void hunt() {
        System.out.println("Нелетающие птицы охотятся на рыбу (пингвины), насекомых, мелких животных (страусы)");

    }

    private void walk () {
        System.out.println("Нелетающие птицы гуляют не спеша, если им не угрожает опасность");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FlightLess)) return false;
        if (!super.equals(o)) return false;
        FlightLess that = (FlightLess) o;
        return movementType.equals(that.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementType);
    }

    @Override
    public String toString() {
        return "FlightLess{" +
                "movementType='" + movementType + '\'' +
                "} " + super.toString();
    }

    public void informationOfFlightlessBirds () {
        System.out.println("Кличка птицы - " + getName() + ", возраст - " + getBirthYear() + " лет"
                + ", среда обитания - " + getHabitat() + ", тип передвижения - " + getMovementType());
    }
}
