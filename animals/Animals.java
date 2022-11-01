package animals;

import java.time.LocalDate;
import java.time.Year;
import java.util.Objects;

public abstract class Animals {
    private String name;

    private final int birthYear;

    public Animals(String name, int birthYear) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Вася";}
        if (birthYear <= 0) {
            this.birthYear = 0;
        } else {
            this.birthYear = LocalDate.now().getYear() - birthYear;}
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Вася";}
    }

    public abstract void eat ();

    public abstract void sleep ();

    public abstract void move ();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return birthYear == animals.birthYear && name.equals(animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthYear);
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
