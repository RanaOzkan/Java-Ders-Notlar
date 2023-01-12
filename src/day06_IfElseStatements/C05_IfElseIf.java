package day06_IfElseStatements;

import java.util.Scanner;

public class C05_IfElseIf {
    public static void main(String[] args) {
        // Ornek :
        // Ogrencinin notu 85 ve ustu ise AA,
        // (85 ve ustu  degilse) 65 ve ustu ise BB,
        // (65 ve ustu  de degilse) 50 ve ustu ise CC,
        // (geriye kalanlar) DD

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen notunuzu giriniz");

        double not= scan.nextDouble();

        if (not<0 || not>100){
            System.out.println("Geçersiz not");
        } else if (not>=85 && not<=100) {
            System.out.println("Notunuz AA, tebrikler");
        } else if (not>=65 && not<85) {
            System.out.println("Notunuz BB, tebrikler");

        } else if (not>=50 & not<65) {
            System.out.println("Notunuz CC, tebrikler");

        } else if (not>=0 && not<50) {
            System.out.println("Notunuz DD, kaldınız");

        }


    }
}
