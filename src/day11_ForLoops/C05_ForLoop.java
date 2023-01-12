package day11_ForLoops;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scan= new Scanner(System.in);

        int baslangic= scan.nextInt();
        int bitis= scan.nextInt();

        if (bitis<baslangic) System.out.println("Baslangic degeri bitis degerinden kücük olmali");
        else {
            int toplam=0;

            for (int i = baslangic; i <= bitis; i++) {

                toplam+=i; // tum sayilari sirasi ile toplam' ekledik
            }
            System.out.println( baslangic +" ile "+ bitis + " arasindaki sayilarin toplami : " + toplam);
        }


    }
}
