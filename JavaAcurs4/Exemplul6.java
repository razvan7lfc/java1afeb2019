public class Exemplul6 {
    public static void main(String [] args) {
        Card c = new DebitCard();
        c.sold = 1000;
        
        c.retragere(1100);
        System.out.println(c.sold); //se va afisa 1000 pt ca nu-mi permite sa scad mai mult decat am
        
    }
}