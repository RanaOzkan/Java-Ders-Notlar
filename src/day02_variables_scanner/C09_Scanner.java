package day02_variables_scanner;

import java.util.Scanner;

public class C09_Scanner {
    public static void main(String[] args) {

      /*
    Soru 7 (Interview)- Kullanicidan iki sayi alip
    ikisinin degerlerini degistirin(swap).
        kullanicinin girdigi degerler
        sayi1= 10  sayi2=20 ise
        siz kod ile bunlarin degerlerini degistirip
        sayi1=20  sayi2=10 yapin
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen sayi 1'i giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("Lütfen sayi 2'i giriniz");
        int sayi2 = scan.nextInt();

        int temp ;
        temp=sayi2;
        sayi2=sayi1;
        sayi1=temp;

        System.out.println("sayilarin yerini degistirdim"
                + "\nsayi1'in yeni degeri:"+sayi1
                + "\nsayi2'in yeni degeri:"+sayi2);
    }
}
