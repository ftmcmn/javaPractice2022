package practice_basic_day02;

public class Me2 {
    public static void main(String[] args) {
        /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

        char finalNotu='E';
        String sonuc=finalNotu=='A'?"gayet basarili":finalNotu=='B'?"basarili":finalNotu=='C'?"ha gayret":"digerleri";
        System.out.println(sonuc);
    }
}
