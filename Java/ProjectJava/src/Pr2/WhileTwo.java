package Pr2;
import java.util.Scanner;

public class WhileTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение x: ");
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
            double term = calculateTerm(x, i);
            sum += term;
        }
        return sum;
    }

    public static double calculateTerm(double x, int n) {
        double numerator = 2 * n * Math.pow(x, 2 * n + 1);
        double denominator = factorial(2 * n + 1);
        return Math.pow(-1, n) * numerator / denominator;
    }

    public static long factorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}