package day03_scanner;

public class C03_Swap2 {
    public static void main(String[] args) {

        int sayi1 = 10, sayi2 = 20;
        sayi1 = sayi1 + sayi2;
        sayi2 = sayi1 - sayi2;
        sayi1 = sayi1 - sayi2;

        System.out.println("Sayi1 :" + sayi1);
        System.out.println("Sayi2 :" + sayi2);

    }
}
