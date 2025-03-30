package Pr7;

public class Main2 {
    public static void main(String[] args) {
        Habitat savanna = new Habitat("Savanna", "Africa");
        Habitat forest = new Habitat("Forest", "Europe");

        Animal lion = new Carnivore("Lion", savanna);
        Animal bear = new Omnivore("Bear", forest);
        Animal deer = new Herbivore("Deer", forest);

        lion.displayInfo();
        System.out.println();
        bear.displayInfo();
        System.out.println();
        deer.displayInfo();
    }
}