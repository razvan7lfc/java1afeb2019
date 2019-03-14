public enum Coffee {
    SMALL(10), MEDIUM(50), BIG; //small si medium apeleaza al doilea constructor, big pe primul
    
    private int qty;
    
    Coffee() {
        
    }
    
    Coffee(int qty) {
        this.qty = qty;
    }
    
    public void drink() {
        this.qty--;
    }
}