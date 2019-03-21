public class Exemplul7 {
    public static void main(String [] args) {
        
        Taietor t1 = new Taietor() {
        
            public void taie(){
                System.out.println("Cut cut!");
            }
        };
        
        t1.taie();
        
        Taietor t2 = () -> System.out.println("Cut cut!"); //expresia lambda care simplifica t1
    }
}