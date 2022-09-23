package day03_scanner;

import java.util.Scanner;

public class C05_Scanner2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi giriniz");
        double sayi1 = scan.nextDouble();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        double sayi2 = scan.nextDouble();

        System.out.println("Sonuc :" + sayi1 * sayi2);

    }
}
