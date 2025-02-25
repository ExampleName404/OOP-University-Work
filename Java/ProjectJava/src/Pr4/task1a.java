package Pr4;
import java.util.Scanner;

public class task1a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод данных
        System.out.print("Введите кэш-память (MB): ");
        int cashMemory = scanner.nextInt();

        System.out.print("Введите цену процессора: ");
        int price = scanner.nextInt();

        System.out.print("Введите вес процессора (г): ");
        int weight = scanner.nextInt();

        // Создаём объект CPU с введёнными пользователем данными
        CPU myCPU = new CPU(cashMemory, price, weight);

        // Закрываем Scanner (необязательно, но хорошая практика)
        scanner.close();

        // Выводим информацию о процессоре
        myCPU.displayInfo();
    }
}
