package day02_variables_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {


     Scanner scanner = new Scanner(System.in);

        System.out.println("lütfen adınızı giriniz");

        String girilenIsim = scanner.nextLine();

        System.out.println(girilenIsim.toLowerCase());

        System.out.println("lütfen yaşınızı giriniz");

        int girileYas = scanner.nextInt();

        System.out.println(girileYas);
















    }}
