package Pr5.Animals;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Rump", 15, 0.5, 5),
                new Dog("Utin", 20, 0.6, 6),
                new Cat("Zelen", 4, 0.3, 3),
                new Cat("Sky", 5, 0.35, 4),
                new Bear("Ussia", 300, 2.5, 10),
                new Bear("Oris", 150, 1.8, 8)
        };

        for (Animal animal : animals) {
            System.out.println(animal.getDescription());
            animal.makeNoise();
            animal.eat();
            System.out.println();
        }

        // Поскольку метод getDescription() переопределён в каждом подклассе (Dog, Cat, Bear), вызовется именно версия метода конкретного типа объекта.
    }
}