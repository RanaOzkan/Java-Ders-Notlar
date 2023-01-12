package day10_stringManipulations;

public class C10_ForLoop {
    public static void main(String[] args) {
        // input olarak verilen sayidan baslayip
        // 7'ser 7'ser artirarak input olarak verilen bitis sayisina kadar
        // - tum sayilari
        // - kac adet sayi oldugunu
        // - ve bu sayilarin toplaminin kac oldugunu yazdirin

        int inputBaslangic=34;
        int inputBitis=563;
        int sayac=0;
        int toplam=0;

        for (int i = inputBaslangic; i <=inputBitis ; i+=7) {
            System.out.print(i + " ");
            sayac++;
            toplam+=i;
        }

        System.out.println("Toplam" + sayac + " adet sayı var" + "\nBunların toplamı : " + toplam);

    }
}
