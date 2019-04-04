public class Exemplul6 {

    public static void main (String []args) {
        Grup<Integer, String, Double> g1 = new Grup <Integer, String, Double>();
        //sau
        Grup<Integer, String, Double> g2 = new Grup<>(); //nu mai punem tipurile generice pt ca le subintelege datorita constrangerii din partea stanga
        
        Grup<?,?,?> g3 = new Grup<>(); //Object, Object, Object
        
        Grup<? extends Number,?, String> g4 = new Grup<>(); //Number, Object, String
        
        Grup<? super Number, ?, ?> g5 = new Grup<>(); //Object, Object, Object
        
        Grup<Integer, String, ? extends Integer> g6 = new Grup<>(); //Integer, String, Integer
    }
}