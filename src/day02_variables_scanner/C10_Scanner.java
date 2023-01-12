package day02_variables_scanner;

import java.util.Scanner;

public class C10_Scanner {
    public static void main(String[] args) {
         /*
        Soru 2- Kullanicidan bir double, bir de int sayi alip
        bunlarin toplamini ve carpimini yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ondalıklı bir sayı giriniz");
        double sayi1 = scanner.nextDouble();
        System.out.println("Tamsayı bir sayı giriniz");
        int sayi2 = scanner.nextInt();
        System.out.println("Sayıların toplamı:"+ (sayi1+sayi2));
        System.out.println("Sayıların çarpımı:"+ sayi1*sayi2);
    }
}
