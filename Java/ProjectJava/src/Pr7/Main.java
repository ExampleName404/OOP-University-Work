package Pr7;

public class Main {
    public static void main(String[] args) {
        IWildAnimal wolf = new Wolf("Gray");
        System.out.println("Animal: " + wolf.getName());
        wolf.move();
        wolf.hunt();
        wolf.rest();
    }
}