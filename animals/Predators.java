package animals;

import java.util.Objects;

public class Predators extends Mammals {

    private String typeOfFood;

    public Predators(String name, int birthYear, String habitat, int travelSpeed, String typeOfFood) {
        super(name, birthYear, habitat, travelSpeed);
        if (typeOfFood != null && !typeOfFood.isEmpty() && !typeOfFood.isBlank()) {
            this.typeOfFood = typeOfFood;
        } else {
            this.typeOfFood = "мясо";}
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood != null && !typeOfFood.isEmpty() && !typeOfFood.isBlank()) {
            this.typeOfFood = typeOfFood;
        } else {
            this.typeOfFood = "мясо";}
    }

    @Override
    public void walk() {

    }

    private void hunt () {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Predators)) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return typeOfFood.equals(predators.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    @Override
    public String toString() {
        return "Predators{" +
                "typeOfFood='" + typeOfFood + '\'' +
                "} " + super.toString();
    }

    public void informationOfPredators () {
        System.out.println("Кличка хищника - " + getName() + ", возраст - " + getBirthYear() + " лет"
                + ", среда обитания - " + getHabitat() + ", скорость передвижения - " + getTravelSpeed() + " км/ч" + ", тип еды - " + getTypeOfFood());
    }
}
