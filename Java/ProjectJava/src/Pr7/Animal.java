package Pr7;

abstract class Animal implements IEatingBehavior {
    private String name;
    private Habitat habitat;

    public Animal(String name, Habitat habitat) {
        this.name = name;
        this.habitat = habitat;
    }

    public String getName() {
        return name;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }

    public void displayInfo() {
        System.out.println("Animal: " + name);
        habitat.describe();
        System.out.println("Diet Type: " + getDietType());
        eat();
    }
}