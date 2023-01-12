package day02_variables_scanner;

public class C03_NonPrimitiveDataTypes {
    public static void main(String[] args) {

        String str= "Java candir";
        int sayi=10;

        // primitive data turlerinin hazır methodlari yoktur
        // ancak non-primitive data turlerinin onceden hazirlanmis,
        // bizim kullanabileceğimiz methodlari olur

        System.out.println(sayi); //10

        System.out.println(str.toLowerCase()); // java candir
                                               // Sadece bir defaya mahsus küçük harfe çevirir

        System.out.println(str); // Java candir

    }
}
