public class Persoana {
    String nume;
    String masina;
    
    Persoana(String nume) {
        this.nume = nume;
   }
   
   void cumpara(Magazin magazin, String marca, String culoarea) {
       this.masina = magazin.importa(marca, culoare);
    }
}