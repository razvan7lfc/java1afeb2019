import java.util.*;

public class Exemplul15 {

    public static void main(String[]args) {
        List<Integer> list = Arrays.asList(2,3,4,5,6,7,8,9);
        
        List<Integer> res = list.subList(2,5);
        
        System.out.println(res); // [4,5,6]
    }
}
//orice interval e inchis la inceput, deschis la final