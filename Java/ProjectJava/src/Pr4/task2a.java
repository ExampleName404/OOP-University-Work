package Pr4;
import java.util.Scanner;

public class task2a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод данных
        System.out.print("Введите память (MB): ");
        int memory = scanner.nextInt();

        System.out.print("Введите цену HDD ");
        int price = scanner.nextInt();

        System.out.print("Введите вес HDD (г): ");
        int weight = scanner.nextInt();

        HDD hdd1 = new HDD(memory,price,weight);
        hdd1.displayInfo();
    }
}
