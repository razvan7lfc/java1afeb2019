public class Exemplul12{

    public static void main(String [] args) {
        Grup<Numar<Integer>,
            Grup<Integer,String,Numar<Double>>, 
                Grup<String, String,String>> g1;
                
        Grup g2 = new Grup(); // Grup<?,?,?> g2 = new Grup<>();
    }
}