package day03_scanner;

import java.util.Scanner;

public class C06_Scanner3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String kullaniciIsmi = scan.next();
        System.out.println("Lutfen soyisminizi giriniz");
        String kullaniciSoyadi = scan.next();
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();
        System.out.println("girilen bilgiler :" + kullaniciIsmi + " " + kullaniciSoyadi + " " + yas);

    }
}
