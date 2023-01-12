package day05_ifStatements;

import java.util.Scanner;

public class C01_IfStatements {
    public static void main(String[] args) {

        // Ogrenciden notu rakam olarak alıp harf olarak yazdırın
        //0-49,999 DD
        //50_64,999 CC
        //65-84,999 BB
        //85-100 AA

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        double not= scanner.nextDouble();

        if (0<=not && not<50 ){
            System.out.println("Notunuz DD, maalesef kaldınız");
        }

        // Süslü parantezin sebebi bu kod if şartını sağlıyorsa
        // çalışacak kodları konsola yazmamızı sağlar

        if (50<=not && not<65 ){
            System.out.println("Notunuz CC, tebrikler geçtiniz");
        }

        if (65<=not && not<85 ){
            System.out.println("Notunuz BB");
        }

        if (85<=not && not<=100 ){
            System.out.println("Tebrikler, notunuz AA");
        }


    }
}
