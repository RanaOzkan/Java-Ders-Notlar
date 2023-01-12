package day11_ForLoops;

public class C09_NestedLoop {
    public static void main(String[] args) {

        // input olarak verilen kenar uzunluklarina gore
        // asagidaki sekli cizdirin

        int kisaKenar=6;
        int uzunKenar=9;

        /*
                * * * * * * * *   // bir satiri nasil yazdiracagimizi inner loop ile belirliyoruz
                * * * * * * * *
                * * * * * * * *
                * * * * * * * *
                * * * * * * * *

         */


        for (int i = 1; i <=kisaKenar ; i++) {
            for (int j = 1; j <=uzunKenar ; j++) {
                System.out.print("* ");
            }
            System.out.println("");

        }

    }
}
