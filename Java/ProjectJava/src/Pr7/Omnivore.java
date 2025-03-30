package Pr7;

class Omnivore extends Animal {
    public Omnivore(String name, Habitat habitat) {
        super(name, habitat);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats both meat and plants.");
    }

    @Override
    public String getDietType() {
        return "Omnivore";
    }
}
