package animals;

import java.util.Objects;

public abstract class Birds extends Animals {

    private String habitat;

    public Birds(String name, int birthYear, String habitat) {
        super(name, birthYear);
        if (habitat != null && !habitat.isEmpty() && !habitat.isBlank()) {
            this.habitat = habitat;
        } else {
            this.habitat = "небо";}
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if (habitat != null && !habitat.isEmpty() && !habitat.isBlank()) {
            this.habitat = habitat;
        } else {
            this.habitat = "небо";}
    }

    @Override
    public void eat() {
        System.out.println("Птицы в зависимости от вида питаются растениями, мясом или насекомыми");
    }

    @Override
    public void sleep() {
        System.out.println("Птицы могут спать как сидя, так и стоя даже на одной ноге, при этом либо просто закрывая глаза (во время дремоты), либо пряча голову под крыло");

    }

    @Override
    public void move() {
        System.out.println("Основной способ передвижения птиц - полет с помощью крыльев");

    }

    public abstract void hunt ();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Birds)) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return habitat.equals(birds.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat);
    }

    @Override
    public String toString() {
        return "Birds{" +
                "habitat='" + habitat + '\'' +
                "} " + super.toString();
    }
}





