package practice_basic_day01;

import java.util.Scanner;

public class Me10 {
    public static void main(String[] args) {
        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen Y ve N degerlerinden birini giriniz");
        char karakter=scan.next().charAt(0);


        if (karakter=='Y'){
            System.out.println("YES");

        }else if (karakter=='N'){
            System.out.println("NO");
        }else System.out.println("yanlis giris yaptiniz tekrar deneyiniz");


    }
}
