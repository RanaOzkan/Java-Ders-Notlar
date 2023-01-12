package day10_stringManipulations;

import java.util.Scanner;

public class C09_ForLoop {
    public static void main(String[] args) {

        // Kullanicidan baslangic ve bitis degerlerini alip
        // bu sinirlar dahil olarak, bu sayilar arasinda 5'in kati olan sayilari yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen baslangic degerini giriniz");
        int baslangicDeger= scan.nextInt();
        System.out.println("Lütfen bitis degerini giriniz");
        int bitisDeger= scan.nextInt();

        for (int i =baslangicDeger; i <=bitisDeger ; i++) {

            if (i%5==0) System.out.print(i+ " ");

        }

    }
}
