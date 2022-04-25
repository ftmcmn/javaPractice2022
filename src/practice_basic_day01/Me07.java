package practice_basic_day01;

import java.util.Scanner;

public class Me07 {
    public static void main(String[] args) {
         /*
        galonu litreye ceviren bir java programi yaziniz
            1 gallon = 3.785 litre
        litreyi galona ceviren bir java programi yaziniz
            1 litre = 1/3.785 gallon

        // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
        // formül
        // c = (f-32)*5/9
     */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen litreye cevirmek istediginiz gallon miktarini yaziniz");
        double gallon= scan.nextDouble();

        System.out.println("lutfen galona cevirmek istediginiz litre miktarini yaziniz");
        double litre= scan.nextDouble();

        System.out.println("lutfen cevirmek istediginiz fahrenhayt derecesini yaziniz");
        double f=scan.nextDouble();
        double c;
        litre=gallon*3.785;
        gallon=litre/3.785;

        c=(f-32)*5/9;
        System.out.println("galondan cevirdiginiz litre miktari: "+litre);
        System.out.println("litreden cevirdiginiz galon miktari: "+gallon);
        System.out.println("fahrenhayttan cevirdiginiz santigrat derecesi: "+c+" derecedir..");


    }
}
