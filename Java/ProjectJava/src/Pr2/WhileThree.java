package Pr2;
import java.util.Scanner;

public class WhileThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение x (-1 < x < 1): ");
        double x = scanner.nextDouble();

        double sum = calculateSum(x);
        System.out.println("Сумма ряда для x = " + x + ": " + sum);

        scanner.close();
    }

    public static double calculateSum(double x) {
        double sum = 0;
        double term;
        int n = 0;

        do {
            term = Math.pow(x, 2 * n + 1) / (2 * n + 1);
            sum += term;
            n++;
        } while (Math.abs(term) > 1e-6); // Условие остановки: |term| < 1e-6

        return sum;
    }
}