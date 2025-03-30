package Pr7;

class Wolf implements IWildAnimal {
    private String name;

    public Wolf(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println(name + " is running through the forest.");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void hunt() {
        System.out.println(name + " is hunting for prey.");
    }

    @Override
    public void rest() {
        System.out.println(name + " is resting in its den.");
    }
}