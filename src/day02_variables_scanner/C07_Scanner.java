package day02_variables_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

         /*
        Soru 3- Kullanicidan ismini, soyismini ve yasini alip,
        asagidaki formmatta yazdirin.
        Isminiz : John
        Soyisminiz : Doe
        Yasiniz : 44
        Kaydiniz basariyla tamamlanmistir.
         */


        Scanner scan = new Scanner(System.in);

        System.out.println("İsminiz:");

        String girilenIsim = scan.nextLine();

        System.out.println("Soyisminiz:");

        String girilenSoyIsim = scan.nextLine();

        System.out.println("Yaşınız:");

        int girilenYas = scan.nextInt();

        System.out.println("İsminiz:" + girilenIsim+
                           "\nSoyisminiz:" + girilenSoyIsim+
                           "\nYaşınız:" + girilenYas+
                           "\nKaydiniz basariyla tamamlanmistir.");








    }
}
