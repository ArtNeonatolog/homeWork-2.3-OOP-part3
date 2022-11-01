import animals.*;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Задание 1");
        Herbivores gazelle = new Herbivores("Курва", 2014, "", 0, "трава");
        gazelle.informationOfHerbivores();
        System.out.println(gazelle.toString());
        System.out.println();

        Herbivores giraffe = new Herbivores("Мелман", 2015, "", 60, "листва");
        giraffe.informationOfHerbivores();
        System.out.println(giraffe.toString());
        System.out.println();

        Herbivores horse = new Herbivores("Юлий", 2017, "степь", 80, "овес");
        horse.informationOfHerbivores();
        System.out.println(horse.toString());
        System.out.println();

        Predators hyena = new Predators("Миклуха", 2019, "", 64, "");
        hyena.informationOfPredators();
        System.out.println(hyena.toString());
        System.out.println();

        Predators tiger = new Predators("Бывалый", 2016, "Дальний Восток",55, "мясо, рыба");
        tiger.informationOfPredators();
        System.out.println(tiger.toString());
        System.out.println();

        Predators bear = new Predators("Миша косолапый", 2013, "лес", 50, "мясо, рыба, мед, ягоды");
        bear.informationOfPredators();
        System.out.println(bear.toString());
        System.out.println();

        Amphibians frog = new Amphibians("Француз", 2021, "");
        frog.informationOfAmphibians();
        System.out.println(frog.toString());
        System.out.println();

        Amphibians adder = new Amphibians("Хвостатый", 2022, "");
        adder.informationOfAmphibians();
        System.out.println(adder.toString());
        System.out.println();

        FlightLess peacock = new FlightLess("Гоша", 2021, "джунгли", "");
        peacock.informationOfFlightlessBirds();
        System.out.println(peacock.toString());
        System.out.println();

        FlightLess penguin = new FlightLess("Япончик", 2020, "Антарктида", "вразвалку");
        penguin.informationOfFlightlessBirds();
        System.out.println(penguin.toString());
        System.out.println();

        FlightLess dodo = new FlightLess("Рико", 2021, "остров Маврикий", "");
        dodo.informationOfFlightlessBirds();
        System.out.println(dodo.toString());
        System.out.println();

        Flying gull = new Flying("Альбинос", 2021, "побережье морей", "");
        gull.informationOfFlyingBirds();
        System.out.println(gull.toString());
        System.out.println();

        Flying albatross = new Flying("Удонда", 2022, "побережье Южного океана", "");
        albatross.informationOfFlyingBirds();
        System.out.println(albatross.toString());
        System.out.println();

        Flying falcon = new Flying("Крутыш", 2020, "пустыня, тундра, тайга", "");
        falcon.informationOfFlyingBirds();
        System.out.println(falcon.toString());

    }
}
