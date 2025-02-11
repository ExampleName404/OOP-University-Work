package Pr3;

import java.util.Scanner;
import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод размерности матрицы
        System.out.print("Введите количество строк (N): ");
        int N = scanner.nextInt();
        System.out.print("Введите количество столбцов (M): ");
        int M = scanner.nextInt();

        int[][] matrix = new int[N][M];

        // Ввод элементов матрицы
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        // Сортируем матрицу по столбцам
        for (int col = 0; col < M; col++) { // Проходим по каждому столбцу
            for (int i = 1; i < N; i++) {
                int key = matrix[i][col]; // Берем текущий элемент
                int j = i - 1;

                // Перемещаем элементы, если они больше текущего
                while (j >= 0 && matrix[j][col] > key) {
                    matrix[j + 1][col] = matrix[j][col];
                    j--;
                }
                matrix[j + 1][col] = key;
            }
        }

        // Вывод отсортированной матрицы
        System.out.println("Отсортированная матрица:");
        for (int i = 0; i < N; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
