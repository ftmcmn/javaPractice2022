package practice_basic_day01;

import java.util.Scanner;

public class Me09 {
    // kullaniciya ad, memleket,su anki konum, yas,
    // boy soran bir program olusturun,
    // ve yasadiklari yeri seviyorlarsa
    // bu bilgiyi yazdirin

    // next() only can read the first word
    // nextLine() can read the whole line

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen adinizi giriniz");
        String ad=scan.nextLine();

        System.out.println("lutfen memleketinizi giriniz");
        String memleket=scan.nextLine();

        System.out.println("lutfen su anki konumunuzu giriniz");
        String konum=scan.nextLine();

        System.out.println("lutfen yasinizi giriniz");
        int yas=scan.nextInt();

        System.out.println("lutfen boyunuzu giriniz");
        double boy=scan.nextDouble();

        System.out.println("yasadıginiz "+konum+" seviyor musuzunuz? true/false");
        boolean seviyorMu= scan.hasNextBoolean();

        System.out.println("adınız : "+ad);
        System.out.println("memleket : "+memleket);
        System.out.println("konumunuz : "+konum);
        System.out.println("yasiniz : "+yas);
        System.out.println("boyunuz : "+boy);

        if (seviyorMu==true){
            System.out.println("yasadiginiz yeri seviyorsunuz");

        }else if(seviyorMu==false) {
            System.out.println("yasadiginiz yeri sevmiyorsunuz");
        }








    }

}
