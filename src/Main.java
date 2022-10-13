public class Main {
    public static void main(String[] args) {
        text();
        System.out.println(" ");
        face();
        System.out.println("Media celor 3 numere este: " + medie(3,5,7));
        System.out.println("Restul impartirii celor 2 numere este: " + rest(8,5));
        System.out.println("Conversia din grade Farenheit in grade Celsius: " + conversie(200));
        System.out.println("Conversia in metri din inch este: " + inchToMeters(5));

    }
    static void text(){
        System.out.println("   J    a   v     v  a");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   v v  aaaaa");
        System.out.println(" JJ  a     a   v  a     a");
    }
    static void face(){
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '_' | ");
        System.out.println(" +_____+ ");
    }
    static float medie(float x,float y, float z){
        float med = (x + y + z)/3;
        return med;
    }
    static float rest(float x, float y){
        float rest = x % y;
        return rest;

    }
    static float conversie(float x){
        float c = 5/9f * (x-32);
        return c;
    }
    static float inchToMeters(float x){
        float conv = x * 0.0254f;
        return conv;
    }
}