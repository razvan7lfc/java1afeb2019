public class DebitCard extends Card {
    
    @Override//nu e obligatoriu
    public void retragere(double suma) {
        if(this.sold >= suma){
            this.sold -= suma;        
        }
    }
}