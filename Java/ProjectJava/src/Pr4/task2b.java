package Pr4;

public class task2b {
    public static void main(String[] args)
    {
        HDD hdd1 = new HDD(1024,1000,400);
        HDD hdd2 = new HDD(2048,2000,400);

        System.out.println(hdd1.price + hdd2.price);
    }
}
