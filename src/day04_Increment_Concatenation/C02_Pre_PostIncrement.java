package day04_Increment_Concatenation;

public class C02_Pre_PostIncrement {
    public static void main(String[] args) {


        int a = 10;  //                            a=10       b=-           c=-


        int b = a++; // arttır==> sonra            a=11       b=10          c=-
                     // ata   ==> önce

        int c = ++a; // arttır==>önce              a=12       b=10          c=12
                     // ata   ==>sonra


        System.out.println(a + ", " + b + ", " + c); // 12,10,12


        int x = 20; //                             x=20       y=-           z=-


        int y = ++x; //önce arttır                 x=21       y=21           z=-
                     //sonra ata

        int z = y++;//önce ata                     x=21       y=22           z=21
                    //sonra arttır

        System.out.println(x + ", " + y + ", " + z); //21,22,21


        int k= 30;

        System.out.println(k++); // önce ata sonra arttır 30

        System.out.println(++k); // önce arttır sonra ata 32

        System.out.println(k++); // önce yazdır sonra arttır 32

        System.out.println(k); // 33

        int sayi1= 40;//                    1=40    2=-     3=-     4=-
        int sayi2= sayi1++;//               1=41    2=40    3=-     4=-
        int sayi3= --sayi2;//               1=41    2=39    3=39    4=-
        int sayi4= --sayi1;//               1=40    2=39    3=39    4=40
        System.out.println(sayi1 + ", " + sayi2 + ", " + sayi3 + ", " + sayi4);// 40,39,39,40

        int aa=10;
        System.out.println("aa'nın değeri:" + ++aa); //11

        int bb= aa++;
        System.out.println("bb'nin değeri:" + bb ); //11

        int cc= bb++ + aa;
        System.out.println("cc'nin değeri:"+cc); //23

        System.out.println("Son toplam:" + (aa+bb+cc)); //12+12+23


    }
}
