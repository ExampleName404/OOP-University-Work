package Pr2;
import java.util.Scanner;

public class TaskOne {

    public static double calculate(double x, double a, double b) {
        if (x <= 3) {
            return b + 2 * Math.log(Math.abs(x));
        } else {
            return x * x / (x * x + a);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();

        System.out.print("Введите значение a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите значение b: ");
        double b = scanner.nextDouble();

        double result = calculate(x, a, b);
        System.out.println("Результат: " + result);

        scanner.close();
    }
}