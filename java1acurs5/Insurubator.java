public interface Insurubator {
    
    /*public static final*/ int x=10;
    int y = 10;

    /*public abstract*/ void insurubeaza(); //putem scrie sau nu, se subintelege
    public abstract void desurubeaza();
    
    static void m1(){
    }
    
    default void m2() { //nu sunt recomandate, totusi apar la OCA
    
    }
}