package day23_dateTime_varargs;

public class C07_Varargs {

    public static void main(String[] args) {

        // Kac tane string argument yazilirsa yazilsin
        //Argumentlerin en uzun olanini yazdiran bir method oluşturun
        //Not: en uzun kelime olarak birden fazla kelime varsa, ilkini yazdirin

        enUzunuYazdir("Rana","Buhara","Alageyik");
        enUzunuYazdir("Mehmet","Vahit","Nurcan","Java","Zafer","Kerime");

    }

    private static void enUzunuYazdir(String... kelimeler){

        String enUzunKelime=kelimeler[0];

        for (String eachKelimeler: kelimeler
             ) {
            if (eachKelimeler.length() > enUzunKelime.length()) {

                enUzunKelime = eachKelimeler;
            }
        }
            System.out.println(enUzunKelime);

        }
}
