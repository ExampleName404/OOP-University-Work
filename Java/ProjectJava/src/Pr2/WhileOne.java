package Pr2;
import java.util.Scanner;

public class WhileOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение x (-1 <= x < 1): ");
        double x = scanner.nextDouble();

        System.out.print("Введите количество членов ряда n: ");
        int n = scanner.nextInt();

        double sum = calculateSum(x, n);
        System.out.println("Сумма ряда для x = " + x + " и n = " + n + ": " + sum);

        scanner.close();
    }

    public static double calculateSum(double x, int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            double harmonicNumber = calculateHarmonicNumber(i);
            double term = harmonicNumber * Math.pow(x, i + 1) / (i + 1);
            sum += term;
        }
        return 2 * sum;
    }

    public static double calculateHarmonicNumber(int n) {
        double harmonicNumber = 0;
        for (int i = 1; i <= n; i++) {
            harmonicNumber += 1.0 / i;
        }
        return harmonicNumber;
    }
}