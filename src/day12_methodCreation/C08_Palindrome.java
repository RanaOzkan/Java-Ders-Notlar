package day12_methodCreation;

public class C08_Palindrome {
    public static void main(String[] args) {

        // Verilen bir String'in palindrome olup olmadigini yazdirin
        // Palindrome : duz okunusu ile tersten okunusu birbirine ayni olan

        String str="ey ediP adAnada pide Ye";

        String tersStr=C07_TerseCevirme.metniTerseCevir(str);

        C07_TerseCevirme.metniTerseCevir(str);

        if (str.equalsIgnoreCase(tersStr)) System.out.println("Metin palindrome");
        else System.out.println("Metin palindrome değil");

    }
}
