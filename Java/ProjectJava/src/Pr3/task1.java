package Pr3;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Размер массива");
        int array_size = scanner.nextInt();

        char[] character_array = new char[array_size];
        System.out.println("Ввод данных");

        for (int i = 0; i < array_size; i++) {
            character_array[i] = scanner.next().charAt(0);
        }
        scanner.close();

        Sorter.selectionSorter(character_array); // Используем сортировку из другого файла

        System.out.println("Sorted : " + new String(character_array));
    }
}
