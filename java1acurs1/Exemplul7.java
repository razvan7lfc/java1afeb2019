public class Exemplul7 { //aici incepe declararea clasei

    public static void main(String [] args) {
        String x = 3 > 6 ? "Hello" : "World";
        
        System.out.println(x);
        
        String y = 3 > 5 ? (3 < 7 ? "A" : "B") : "C";
        System.out.println(y);
    }
}