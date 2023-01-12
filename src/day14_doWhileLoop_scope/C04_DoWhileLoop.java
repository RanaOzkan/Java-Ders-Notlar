package day14_doWhileLoop_scope;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

        int input= 144;
        int karekok=1;
        boolean sonuc= false;

        while (karekok*karekok <= input){
            if (karekok*karekok==input){
                System.out.println("Girilen sayinin karekoku : " + karekok);
                sonuc=true;
                break;
            }else{
                karekok++;
            }
        }
        System.out.println(sonuc);


        // do while loop ile yapalim

        input=144;
        karekok=1;
        sonuc=false;

        do {
            if (karekok*karekok==input){
                System.out.println("Girilen sayinin karekoku : " + karekok);
                sonuc=true;
                break;
            }else{
                karekok++;
            }
        }while(karekok*karekok<=input);
        System.out.println(sonuc);
    }
}
