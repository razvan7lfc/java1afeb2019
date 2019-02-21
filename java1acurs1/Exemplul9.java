public class Exemplul9 {

    public static void main(String [] args) {
        int zi = 5; 
        switch(zi) {
            case 1:
                System.out.println("luni");
                break;
            case 2:
                System.out.println("marti");
                break;
            case 3:
                System.out.println("miercuri");
                break;
            case 4:
                System.out.println("joi");
                break;
            case 5:
                System.out.println("vineri");
                break;
            case 6:
            case 7:
                System.out.println("weekend");
                break;
            default:
                System.out.println("error");
        }
    
    }
}