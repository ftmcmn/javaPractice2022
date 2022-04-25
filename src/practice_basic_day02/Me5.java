package practice_basic_day02;

import java.util.Scanner;

public class Me5 {
    public static void main(String[] args) {
        // Girilen uc haneli bir sayının okunusnu yazı ile yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.print("sayi giriniz :");
        int sayi = scan.nextInt();

        int birlerBasamagi= sayi%10;
        int onlarBasamagi=(sayi/10)%10;
        int yuzlerBasamagi=sayi/100;

       if (sayi<1000 && sayi>99){
           switch (birlerBasamagi){
               case 1: System.out.println("bir");
                   break;
               case 2: System.out.println("iki");
                   break;
               case 3: System.out.println("uc");
                   break;
               case 4: System.out.println("dort");
                   break;
               case 5: System.out.println("bes");
                   break;
               case 6: System.out.println("altı");
                   break;
               case 7: System.out.println("yedi");
                   break;
               case 8: System.out.println("sekiz");
                   break;
               case 9: System.out.println("dokuz");
                   break;
           }
           switch (onlarBasamagi){

           }
       }


    }
}
