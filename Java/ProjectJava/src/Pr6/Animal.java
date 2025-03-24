package Pr6;

abstract class Animal {
    String name;
    int age;
    Owner owner;

    public Animal(String name, int age, Owner owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    abstract String sound();
    abstract String eat();

    void displayInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age + ", Владелец: " + owner.getName() +
                ", Звук: " + sound() + ", Еда: " + eat());
    }
}

class Owner {
    String name;

    public Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    public Dog(String name, int age, Owner owner) {
        super(name, age, owner);
    }

    @Override
    String sound() {
        return "Гав-гав";
    }

    @Override
    String eat() {
        return "Мясо";
    }
}

class Cat extends Animal {
    public Cat(String name, int age, Owner owner) {
        super(name, age, owner);
    }

    @Override
    String sound() {
        return "Мяу";
    }

    @Override
    String eat() {
        return "Рыбу";
    }
}