package day06_IfElseStatements;

import java.util.Scanner;

public class C10_NestedElse {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin


        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen ürün adedini giriniz");
        int urunAdedi= scan.nextInt();

        System.out.println("Urunun liste fiyatını giriniz");
        double listeFiyati= scan.nextDouble();

        System.out.println("Müşteri kartınız var mı?\nE:Evet H:Hayır");
        char kartVarmi=scan.next().charAt(0);




    }
}
