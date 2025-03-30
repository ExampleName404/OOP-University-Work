package Pr7;

class Herbivore extends Animal {
    public Herbivore(String name, Habitat habitat) {
        super(name, habitat);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats plants.");
    }

    @Override
    public String getDietType() {
        return "Herbivore";
    }
}