public class Exemplul8 {

    public static void main(String [] args) {
        char anotimp = 'w'; //anotimp dat de p v t i
        //char int string enum
        switch(anotimp) {
            case 'v':
                System.out.println("Este cald!");
                break;
            case 'i':
                System.out.println("este frig");
                break;
            case 'p':
            case 't':
                System.out.println("ploua!");
                break;
            default:
                System.out.println(":)");
        }
    
    }
}