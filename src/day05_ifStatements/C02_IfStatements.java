package day05_ifStatements;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {

          /*
            Basit if cumleleri kodun geri kalanindan bagimsizdir
            sadece 1 sarta odaklanir
            o sart true ise if body calisir
            sart false ise if body calismaz( KOD CALISIR)
            birden fazla bagimsiz if cumlesi kullanilmissa
            her cumle birbirinden bagimsiz olacagindan
            bazi degerler icin tum if body'leri calisirken
            bazi degerler icin hic bir if body'si CALISMAYABILIR
         */


        //Kulllanıcıdan bir sayı alıp
        // pozitif ise "pozitif sayi",
        //100 ile 999 arasında ise (sinirlar dahil) "pozitif 3 basamakli sayi"
        //3 ile bölünebiliyorsa "3'ün kati"
        //birler basamagi 7 ise "Mukemmel"
        //seceneklerinden uygun olanlari yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");
        int sayi= scanner.nextInt();

        // pozitif ise "pozitif sayi",
        if (0<sayi){
            System.out.println("pozitif sayi");
        }

        //100 ile 999 arasında ise (sinirlar dahil) "pozitif 3 basamakli sayi"
       if (100<=sayi && sayi<=999){
           System.out.println("pozitif 3 basamakli sayi");
       }

        //3 ile bölünebiliyorsa "3'ün kati"
        if (sayi%3==0){
            System.out.println("3'ün kati");
        }

        //birler basamagi 7 ise "Mukemmel"
        if (sayi%10==7){
            System.out.println("Mukemmel");
        }

    }
}
