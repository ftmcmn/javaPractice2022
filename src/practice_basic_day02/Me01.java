package practice_basic_day02;

import java.util.Scanner;

public class Me01 {
    public static void main(String[] args) {
         /*
    Kullanici dan yas bilgisini alarak

	    oy kullanma yasi :
	 	age >= 18  ==> oy kullanmaya uygun
	 	age >= 70  ==> uc kez oy kullanabilir
	 	70 > age >=50 ==> iki kez oy kullanabilir
	 	50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz

	 */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        if (yas >= 18) {
            System.out.println("yasi oy kullanmaya uygun");
            if (50 > yas) {
                System.out.println("bir kez oy kullanabilir");
            } else if (70 > yas) {
                System.out.println("iki kez oy kullanabilir");
            } else if (yas >= 70) {
                System.out.println("uc kez oy kullanabilir");
            }

        } else if (yas > 0 && yas < 18) {
            System.out.println("oy kullanamaz");
        }else System.out.println("lutfen gecerli bir yas giriniz");
    }
}
