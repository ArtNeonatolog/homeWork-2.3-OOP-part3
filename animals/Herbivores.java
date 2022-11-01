package animals;

import java.util.Objects;

public class Herbivores extends Mammals {

    private String typeOfFood;

    public Herbivores(String name, int birthYear, String habitat, int travelSpeed, String typeOfFood) {
        super(name, birthYear, habitat, travelSpeed);
        if (typeOfFood != null && !typeOfFood.isEmpty() && !typeOfFood.isBlank()) {
            this.typeOfFood = typeOfFood;
        } else {
            this.typeOfFood = "трава";}
    }


    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood != null && !typeOfFood.isEmpty() && !typeOfFood.isBlank()) {
            this.typeOfFood = typeOfFood;
        } else {
            this.typeOfFood = "трава";}
    }

    @Override
    public void walk() {
        System.out.println("Травоядные гуляют не спеша, кушая траву и листву, если им не угрожает опасность");

    }

    private void graze () {
        System.out.println("Травоядные пасутся на лугах, пастбищах едят траву и листья");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Herbivores)) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return typeOfFood.equals(that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    @Override
    public String toString() {
        return "Herbivores{" +
                "typeOfFood='" + typeOfFood + '\'' +
                "} " + super.toString();
    }

    public void informationOfHerbivores () {
        System.out.println("Кличка травоядного животного - " + getName() + ", возраст - " + getBirthYear() + " лет"
        + ", среда обитания - " + getHabitat() + ", скорость передвижения - " + getTravelSpeed() + " км/ч" + ", тип еды - " + getTypeOfFood());
    }
}
