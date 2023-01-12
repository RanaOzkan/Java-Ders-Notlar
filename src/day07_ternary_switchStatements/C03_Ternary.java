package day07_ternary_switchStatements;

public class C03_Ternary {
    public static void main(String[] args) {

        // input olarak verilen sayiyi kontrol edip
        // sayi cift ise "cift sayi"
        // degilse "tek sayi" yazdirin

        int sayi = 34;

        // if else ile yapalım

        if (sayi%2==0) {
            System.out.println("çift sayı");
        } else {
            System.out.println("tek sayı");
        }


        // ternary ile yapalım

            System.out.println(sayi%2==0 ? "çift sayı" : "tek sayı");




    }
}
