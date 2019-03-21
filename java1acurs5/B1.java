public class B1 {
    
    private int x;
    
    void m1(int q) {
        int a = 10;
        
        
        class B2 { // b2 si b3 sunt clase locale, deci nu le putem instantia in alta parte
            
            public void m3(){
                System.out.println(q);
            }
        }
        
    }
    
    
    
    static void m2() {
        class B3 {
            /*public void m4(){
                x=10;
            }*/ //aici nu pot apela x
        }
    }
} //cand fol o zona de mem locala intr-o mem locala devine implicit constanta