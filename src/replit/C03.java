package replit;

public class C03 {
    public static void main(String[]args) {
        // Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
        // Input :  String str="Javaisalsoeasy"    Output: a s

        String str = "Javaisalsoeasy";
        String yinelenenKarakterler = "";

        for (int i = 0; i < str.length(); i++){

            for (int j = 1; j <str.length() ; j++) {

               // (!yinelenenKarakterler.contains()+=str.charAt(i);


            }
        }
        System.out.println(yinelenenKarakterler);

    }

}
