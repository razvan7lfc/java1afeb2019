public class Exemplul5 {
    public static void main(String [] args) {
        Foo b = new Bar();//trebuia Bar b, nu Foo
        
        b.x = 10;
        //b.y = 20;
    }
}