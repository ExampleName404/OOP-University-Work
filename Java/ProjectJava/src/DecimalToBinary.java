import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод десятичного числа
        System.out.println("Введите десятичное число:");
        int decimalNumber = scanner.nextInt();

        // Преобразование в двоичное
        String binaryNumber = Integer.toBinaryString(decimalNumber);

        // Вывод результата
        System.out.println("Двоичное представление числа: " + binaryNumber);

        scanner.close();
    }
}
