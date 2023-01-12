package day08_stringManipulation;

public class C05_charAt {

    public static void main(String[] args) {

        String str ="Java guzeldir"; //13 tane karakter barindirir

        //Java'da index 0'dan başlar
        //J==> 0. index, r ==> 12
        //charAt(index) ile istediğimiz index'deki char'a ulaşabiliriz

        // ilk a'yı yazdiralim
        System.out.println(str.charAt(1));

        // sondan 2. harfi yazdiralim
        System.out.println(str.charAt(13-2)); // karakter sayisi-2. indexdeki elemani yazdirir

        // sondan 4. karakteri büyük harf olarak yazdiralim
        System.out.println(str.toUpperCase().charAt(13-4));

        // charAt() method'u bize char döndürdügü icin toUppercase() calismaz
        // String method'larini charAt() ile kullanmak isterseniz
        // charAt()'den once kullanmalisiniz

        // System.out.println(str.charAt(18)); // StringIndexOutOfBoundsException
        // Eger index olarak karakter sayisi veya daha buyuk bir deger girersek
        // o index'i bulamayacagi icin hata verir


    }
}
