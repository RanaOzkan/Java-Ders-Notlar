package day08_stringManipulation;

import java.util.Scanner;

public class C01_StringManipulation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Gun ismini giriniz");
        String girilenGun= scan.next();
        String kullanilacakGun=girilenGun.toLowerCase();
        /*
           string ifadeler case sensitive'dir
           kullanicinin Pazar, PAzar, PazaR, PAZAR ... gibi 32 farkli sekilde yazma ihtimali vardır

           Kullanicinin girdiği değeri direkt kalici olarak değiştirmek tercih edilmez
           bunun yerine kullanicin girdiği değeri yeni bir variable'a atama yapar
           ve kodlarımızda yeni variable'ı kullanırız

           Konsola yazdıracağımız zaman, istersek kullanicinin girdiği orjinal metni yazdiririz
           istersek de bizim cevirdigimiz hali yazariz

         */
        switch (kullanilacakGun){
            case "pazartesi":
                System.out.println(girilenGun + " calisma zamani, tatile 5 gun var");
                break;
            case "sali":
                System.out.println(girilenGun + " calisma zamani, tatile 4 gun var");
                break;
            case "carsamba":
                System.out.println(girilenGun + " calisma zamani, tatile 3 gun var");
                break;
            case "persembe":
                System.out.println(girilenGun + " calisma zamani, tatile 2 gun var");
                break;
            case "cuma":
                System.out.println(girilenGun + " calisma zamani, tatile 1 gun var");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Simdi dinlenme zamani");
                break;
            default:
                System.out.println("Yanlis gun ismi");
        }
    }
}
