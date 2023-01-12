package day09_stringManipulations;

import java.util.Scanner;

public class C04endsWith {
    public static void main(String[] args) {
        String str= "Java öğrenen işsiz kalmaz";

        System.out.println(str.endsWith("kalmaz")); // true

        System.out.println(str.endsWith("ava öğrenen işsiz kalmaz")); // true

        System.out.println(str.endsWith("")); //true


        // SORU : kullanicidan bir mail alin
        // - mail @ icermiyorsa "gecersiz mail"
        // - mail @gmail.com icermiyorsa, "mail gmail olmali"
        // - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var" yazdirin.


        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen bir mail giriniz");

        String girilenMail= scan.nextLine();

        //bitmiyorsa dediğimiz için "!" ünlem işareti koyduk

        if (!girilenMail.contains("@")) System.out.println("gecersiz mail");
        else if (!girilenMail.contains("@gmail.com")) System.out.println("mail gmail olmali");
        else if (!girilenMail.endsWith("@gmail.com")) System.out.println("mailde yazim hatasi var");


    }
}
