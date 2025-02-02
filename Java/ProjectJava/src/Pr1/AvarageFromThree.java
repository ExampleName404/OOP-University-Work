package Pr1;

import java.util.Scanner;

public class AvarageFromThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод трёх чисел
        System.out.println("Введите первое число:");
        double num1 = scanner.nextDouble();

        System.out.println("Введите второе число:");
        double num2 = scanner.nextDouble();

        System.out.println("Введите третье число:");
        double num3 = scanner.nextDouble();

        // Вычисление среднего
        double average = (num1 + num2 + num3) / 3;

        // Вывод среднего значения
        System.out.print("Среднее значение: "+ average);

        scanner.close();
    }
}
