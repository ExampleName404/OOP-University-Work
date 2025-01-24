import java.util.Scanner;

public class RectangleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод длины и ширины
        System.out.println("Введите длину прямоугольника:");
        double length = scanner.nextDouble();

        System.out.println("Введите ширину прямоугольника:");
        double width = scanner.nextDouble();

        // Вычисление площади и периметра
        double area = length * width;
        double perimeter = 2 * (length + width);

        // Вывод результата
        System.out.print("Площадь прямоугольника: " + area);
        System.out.print("Периметр прямоугольника: " + perimeter);

        scanner.close();
    }
}
