package animals;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Mammals extends Animals {

    private String habitat;

    private int travelSpeed;

    public Mammals(String name, int birthYear, String habitat, int travelSpeed) {
        super(name, birthYear);
        if (habitat != null && !habitat.isEmpty() && !habitat.isBlank()) {
            this.habitat = habitat;
        } else {
            this.habitat = "саванна";}
        if (travelSpeed <= 0) {
            this.travelSpeed = 10;
        } else {
            this.travelSpeed = travelSpeed;}
    }

    @Override
    public void eat() {
        System.out.println("Млекопитающие вскармливают детенышей молоком, взрослые особи в зависимости от вида питаются преимущественно мясом или растительной пищей");
    }

    @Override
    public void sleep() {
        System.out.println("У млекопитающих  сон состоит из двух подстадий – медленноволнового сна (МС) и парадоксального сна (ПС) (или быстрого сна, или стадии быстрых движений глаз). " +
                "Разные виды млекопитающих проводят во сне от двух до 20 часов в сутки, а птицы – от пяти до 17 часов.");

    }

    @Override
    public void move() {
        System.out.println("Млекопитающие передвигаются разнообразными способами (бегают, плавают, лазают, летают)");

    }

    public String getHabitat() {
        return habitat;
    }

    public int getTravelSpeed() {
        return travelSpeed;
    }

    public void setTravelSpeed (int travelSpeed){
            if (travelSpeed <= 0) {
                this.travelSpeed = 10;
            } else {
                this.travelSpeed = travelSpeed;
            }
        }

    public void setHabitat(String habitat) {
        if (habitat != null && !habitat.isEmpty() && !habitat.isBlank()) {
            this.habitat = habitat;
        } else {
            this.habitat = "саванна";}
    }

    public abstract void walk ();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mammals)) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return travelSpeed == mammals.travelSpeed && habitat.equals(mammals.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat, travelSpeed);
    }

    @Override
    public String toString() {
        return "Mammals{" +
                "habitat='" + habitat + '\'' +
                ", travelSpeed=" + travelSpeed +
                "} " + super.toString();
    }
}

