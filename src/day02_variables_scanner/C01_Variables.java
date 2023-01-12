package day02_variables_scanner;

public class C01_Variables {

    /*
    Java'da kodlarimizi class'larda olustururuz
    Class'lar ihtiyac duyuldugunda obje olusturmak icin de kullanilir

    Java'nın baslangic noktasi (entry point) main method'dur

    variable'lar datalarimizi saklamak (store) icin olustururuz
     */

    public static void main(String[] args) {

        System.out.println("Java Candir");

           String           ogrenciIsmi              =                "Matrix     ." ;
        // Data turu       variable ismi      assigment (atama)         deger

        System.out.println(ogrenciIsmi); //Matrix     .

        ogrenciIsmi= "Tayfur";

        System.out.println(ogrenciIsmi); //Tayfur
    }
}
