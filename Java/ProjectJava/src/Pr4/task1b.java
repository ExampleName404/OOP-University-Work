package Pr4;
import java.util.Scanner;

public class task1b {
    public static void main(String[] args) {
        // ввод данных
        CPU cpu1 = new CPU(6,44000,120);
        CPU cpu2 = new CPU(12,42500,200);
        CPU cpu3 = new CPU(8,36000,130);
        CPU cpu4 = new CPU(64,3000000,520);
        // вывод через хрень которую мы до этого написали
        cpu1.displayInfo();
        cpu2.displayInfo();
        cpu3.displayInfo();
        cpu4.displayInfo();
    }
}
