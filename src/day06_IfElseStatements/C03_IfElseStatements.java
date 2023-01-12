package day06_IfElseStatements;

import java.util.Scanner;

public class C03_IfElseStatements {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan bir karakter isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir karakter giriniz");

      char girilenHarf=scan.next().charAt(0);
      if (girilenHarf>='a' && girilenHarf<='z' ) {
          //kucuk harf ise onu buyuk harf olarak yazdirin
          System.out.println((char) (girilenHarf - 32));
          System.out.println(Character.toUpperCase(girilenHarf));
      } else {
          // kucuk harf degilse girilen harfi yazdirin
          System.out.println(girilenHarf);
      }


    }
}
