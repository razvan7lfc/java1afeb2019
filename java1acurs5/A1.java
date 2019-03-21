public class A1 { //top level, direct in fisierul de cod sursa
    private int x;
    class A2 {
        public void m() {
            x = 10; //this.x=10 ar insemna A2, care nu are x, puteam scrie doar A1.this.x=10;
        }
    }
    
    /*private/public/protected */ public static class A3 {
    
    }
    
}