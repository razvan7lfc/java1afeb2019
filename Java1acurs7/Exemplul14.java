import java.util.*;

public class Exemplul14 {

    public static void main(String [] args){
        List<Integer> list = new ArrayList<>();
        
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(7); //list.remove(3);
        list.add(2);
        
        list.remove(3); //int
        list.remove((Integer) 3); // integer
               
    }
}
//docs.oracle.com/javase/8/docs/api/java.util/list.html