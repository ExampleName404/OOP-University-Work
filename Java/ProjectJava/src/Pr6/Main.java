package Pr6;

public class Main {
    public static void main(String[] args) {
        // Тестируем классы Animal, Dog, Cat и Owner
        Owner owner1 = new Owner("Алексей");
        Owner owner2 = new Owner("Мария");

        Dog dog = new Dog("Барсик", 3, owner1);
        Cat cat = new Cat("Мурка", 2, owner2);

        dog.displayInfo();
        cat.displayInfo();

        System.out.println("-----------------------------");

        // Тестируем банковские счета
        SavingsAccount savings = new SavingsAccount("12345", 1000.0);
        CheckingAccount checking = new CheckingAccount("67890", 500.0);

        savings.deposit(500);
        savings.withdraw(200);
        savings.displayBalance();

        checking.deposit(500);
        checking.withdraw(200);
        checking.displayBalance();
    }
}

