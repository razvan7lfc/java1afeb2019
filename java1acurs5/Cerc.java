public class Cerc extends Forma {
    
    int nume;
    double raza;
    public Cerc(double raza) {
        super("Cerc");
        this.raza=raza;
        
        super.nume = "Altceva!"; //ma duce la stringul din forma
        this.nume = 10; //ma duce la int
    }
    
    public double arie() {
        return 3.14 * raza * raza;
    }
}