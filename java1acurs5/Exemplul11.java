public class Exemplul11 {

    public static void main (String []args){
    
        Cat c1 = new Cat("Tom");
        Cat c2 = c1;
        Cat c3 = new Cat("Tom");
        
        boolean b1 = c1 == c2; //true
        boolean b2 = c1 == c3; //false, pt ca se creaza o noua pisica
        
        String x = "hello";
        String y = "hello";
        
        boolean b3 = x == y; //true, pt ca e String, hello fiind acelasi obiect in memorie, dar uneori da true, alteori false, depinzand de caz
        // daca puneam String y = new String("hello"); atunci ar fi dat false
        System.out.println(b2);
        System.out.println(b3);
        
        boolean b4 = x.equals(y);
    }
}