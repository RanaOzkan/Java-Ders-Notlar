package day02_variables_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("karesini almak istediğiniz bir sayı giriniz");

        double girilenSayi = scan.nextDouble();

        System.out.println("Sayının karesi :"+ girilenSayi*girilenSayi);




    }
}
