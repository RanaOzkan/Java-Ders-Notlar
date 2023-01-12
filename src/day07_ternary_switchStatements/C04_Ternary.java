package day07_ternary_switchStatements;

public class C04_Ternary {
    public static void main(String[] args) {

        // Kullanicidan alinan deger
        // 100'den buyukse sayiyi 2 ile carpin
        // 100'e esit veya kucuk ise sayiya 10 ekleyin


        int input= 80;

        if (input>100) {
            input*=2; }
        else {
            input += 10;
        }
        System.out.println("if ile yapılırsa:"+ input);


    ////////////////////////////////////////////////////

        int input1= 80;


        input1= input1>100 ? input1*2 : input1+10 ;

        System.out.println("ternary ile yapılırsa:"+input1);




    }
}
