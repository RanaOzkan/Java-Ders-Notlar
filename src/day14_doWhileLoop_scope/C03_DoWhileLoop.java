package day14_doWhileLoop_scope;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        // verilen baslangic ve bitis karakterleri dahil
        // aradaki tum karakterleri yazdirin

        char baslangic='b';
        char bitis='m';

        do {
            System.out.print(baslangic + " ");
            baslangic+=(char)1; //  baslangic=(char)(baslangic+1) şeklindede yazılabilir

        }while (baslangic<=bitis);

    }
}
