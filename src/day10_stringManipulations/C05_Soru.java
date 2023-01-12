package day10_stringManipulations;

import java.util.Scanner;

public class C05_Soru {
    public static void main(String[] args) {

        /*

        Soru 1 : Kullanicidan bir cumle alin
        - cumlede ev geciyorsa, "home home sweet home" yazdirin
        - cumlede is geciyorsa, "calismak guzeldir"
        - ikisini de iceriyorsa "Hem ev lazim hem is"
        - hicbirini icermiyorsa "cok calisman lazim" yazdirin

         */


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");

        String str="Evden calısıyorum, ise gitmeye gerek yok";
        String calismaStr=str.toLowerCase();

        if (calismaStr.contains("ev") && calismaStr.contains(" is")) {
            System.out.println("Hem ev lazim hem is");
        }
        else if (calismaStr.contains("is")) {
            System.out.println("Calismak guzeldir");
        }
        else if (calismaStr.contains("ev")) {
            System.out.println("Home home sweet home");
        }
        else {
            System.out.println("Cok calisman lazim");
        }


    }
}
