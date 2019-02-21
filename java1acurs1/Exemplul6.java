public class Exemplul6 {

    public static void main(String [] args) {
    boolean b1 = true;
    boolean b2 = !b1;
    boolean b3 = !(3 < 4);
    System.out.println(b1);
    System.out.println(b2);
    System.out.println(b3);
    
    boolean b4 = b1 & b2;
    boolean b5 = b1 && b2;
    
    boolean b6 = b1 | b2;
    boolean b7 = b1 || b2;
    
    System.out.println(b4);
    System.out.println(b5);
    System.out.println(b6);
    System.out.println(b7);

    
    }
}