public class Exemplul6 {
    
    public static void main (String [] args) {
        
        Foo f1 = new Foo();
        f1.m(); //Foo
        
        
        Foo f2 = new Foo() {
        
            void m(){
                System.out.println("Bar!");
            }
        }; // acoladele unei clase care o mosteneste pe Foo,adica e o clasa anonima, se aplica numai instantei care se creeaza aici
        
        f2.m(); //Bar!
    }
}