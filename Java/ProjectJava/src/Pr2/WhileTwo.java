package Pr2;
import java.util.Scanner;

public class WhileTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Assalamu alaikum don");
        System.out.println("Vi dolzhny otvetit");
        String otvet = scanner.nextLine();

        if (otvet.equals("Privet")) {
            System.out.println("Izvenyaysya don");
            otvet = scanner.nextLine();
            if (otvet.equals("Izveni")){
                System.out.println("Ladno don");
            }
            else
            {
                System.out.println("ahuel da?");
            }
        }
        else{
            System.out.println("Krasava don");
        }


        scanner.close();
    }
}