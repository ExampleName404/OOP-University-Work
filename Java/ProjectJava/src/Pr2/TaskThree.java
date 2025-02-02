package Pr2;
import java.util.Scanner;

public class TaskThree{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();

        System.out.print("Введите значение a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите значение b: ");
        double b = scanner.nextDouble();

        double y;

        if (x <= 1) {
            y = 1 / (a * a + x * x);
        } else {
            y = b * Math.log(Math.abs(x));
        }

        System.out.println("y(" + x + ") = " + y);
        scanner.close();
    }
}