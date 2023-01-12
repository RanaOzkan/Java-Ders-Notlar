package day23_dateTime_varargs;

public class C05_Varargs {
    public static void main(String[] args) {

        //Verilen 2 sayiyi toplayıp yazdiran bir method oluşturun





    }

    private static void topla(int sayi1, int sayi2, int sayi3, int sayi4){
        System.out.println("Dört sayinin toplami : " + (sayi1+sayi2+sayi3+sayi4));
    }

    private static void topla(int sayi1, int sayi2, int sayi3){
        System.out.println("Uc sayinin toplami : " + (sayi1+sayi2+sayi3));
    }

    private static void topla(int sayi1, int sayi2){
        System.out.println("Iki sayinin toplami : " + (sayi1+sayi2));
    }

}
