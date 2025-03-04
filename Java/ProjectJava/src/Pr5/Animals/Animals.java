package Pr5.Animals;

class Animal {
    String name;
    double weight;
    double height;
    int age;

    Animal(String name, double weight, double height, int age) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.age = age;
    }

    void makeNoise() {
        System.out.println("Animal makes a noise.");
    }

    void eat() {
        System.out.println("Animal is eating.");
    }

    String getDescription() {
        return "Name: " + name + ", Weight: " + weight + "kg, Height: " + height + "m, Age: " + age + " years.";
    }
}

class Dog extends Animal {
    Dog(String name, double weight, double height, int age) {
        super(name, weight, height, age);
    }

    @Override
    void makeNoise() {
        System.out.println(name + " barks: Woof Woof!");
    }

    @Override
    void eat() {
        System.out.println(name + " eats dog food and bones.");
    }

    @Override
    String getDescription() {
        return super.getDescription() + " This is a dog.";
    }
}

class Cat extends Animal {
    Cat(String name, double weight, double height, int age) {
        super(name, weight, height, age);
    }

    @Override
    void makeNoise() {
        System.out.println(name + " meows: Meow Meow!");
    }

    @Override
    void eat() {
        System.out.println(name + " eats cat food and fish.");
    }

    @Override
    String getDescription() {
        return super.getDescription() + " This is a cat.";
    }
}

class Bear extends Animal {
    Bear(String name, double weight, double height, int age) {
        super(name, weight, height, age);
    }

    @Override
    void makeNoise() {
        System.out.println(name + " growls: Grrr!");
    }

    @Override
    void eat() {
        System.out.println(name + " eats berries, fish, and honey.");
    }

    @Override
    String getDescription() {
        return super.getDescription() + " This is a bear.";
    }
}
