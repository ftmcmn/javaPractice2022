package replit;

public class C01 {
    //Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri
    // kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.
    // char ch1= 'a' ;
    //String name ="John came late"
    // Expected Output:
    //Number of a = 2
    public static void main(String[] args) {
        String str="John came late";
        char karakter='a';
        int tane = 0;

        for(int i = 0; i < str.length(); i++) {
            if(karakter == str.charAt(i)) {
                tane++;
            }
        }

        System.out.println( karakter + " yazı içinde  " + tane +" tanedir");


    }
}
