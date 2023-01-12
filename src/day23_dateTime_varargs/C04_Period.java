package day23_dateTime_varargs;

import java.time.LocalDate;
import java.time.Period;

public class C04_Period {
    public static void main(String[] args) {

        LocalDate dogumTarihi=LocalDate.of(1998,6,11);
        LocalDate bugun= LocalDate.now();

        Period yas=Period.between(dogumTarihi,bugun);

        System.out.println(yas); // P27Y4M8D
        System.out.println(yas.getYears()); // 27

        LocalDate baslangic=LocalDate.of(2016,9,20);
        LocalDate bitis=LocalDate.of(2020,6,11);

        Period sure=Period.between(baslangic,bitis);
        System.out.println(sure); // P3Y8M22D

    }
}
