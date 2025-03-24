package Pr6;

abstract class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void displayInfo();
}

class Student extends Person {
    String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    void displayInfo() {
        System.out.println("Студент: " + name + ", возраст: " + age + ", специальность: " + major);
    }
}

class Employee extends Person {
    String position;

    public Employee(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    @Override
    void displayInfo() {
        System.out.println("Сотрудник: " + name + ", возраст: " + age + ", должность: " + position);
    }
}