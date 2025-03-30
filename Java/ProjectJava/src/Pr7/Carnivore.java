package Pr7;

class Carnivore extends Animal {
    public Carnivore(String name, Habitat habitat) {
        super(name, habitat);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats meat.");
    }

    @Override
    public String getDietType() {
        return "Carnivore";
    }
}