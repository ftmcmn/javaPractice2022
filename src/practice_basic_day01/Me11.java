package practice_basic_day01;

import java.util.Scanner;

public class Me11 {
    public static void main(String[] args) {

        /*
    not hesaplayici
		   	A => 90 ~100
		   	B => 80 ~ 89
		   	C => 70 ~ 79
		   	D => 60 ~ 69
		   	F =>  0 ~ 59
     */
        int not=45;

        if (not<=100 && not>=90){
            System.out.println("A");
        }else if (not>=80){
            System.out.println("B");
        }else if (not>=70){
            System.out.println("C");
        }else if (not>=60){
            System.out.println("D");
        }else if (not<=59 && not>=0) {
            System.out.println("F");
        }else System.out.println("yanlis deger girdiniz tekrar deneyin");

    }
}
