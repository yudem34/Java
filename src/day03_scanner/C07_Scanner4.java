package day03_scanner;

import java.util.Scanner;

public class C07_Scanner4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isminizi,soyisminizi ve yasini giriniz \naralarda Enter tusuna basiniz");
        String isim = scan.nextLine();
        String Soyisim = scan.nextLine();
        int yas = scan.nextInt();
        System.out.println("girilen bilgiler :" + isim + " " + Soyisim + " " + yas);
    }
}
