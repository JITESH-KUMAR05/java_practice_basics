import java.util.*;

public class Trset {
    public static void main(String args[]){
        TreeSet<String> tr = new TreeSet();
        tr.add("a");
        tr.add("b");
        tr.add("c");
        System.out.println("Initial tree set : " + tr);
        System.out.println("Reversed tree set : " + tr.descendingSet());
        System.out.println("Head set : " + tr.headSet("a",true));
        System.out.println("Tail set : " + tr.tailSet("a",false));
        System.out.println("Subset : " + tr.subSet("a",true,"c",false));
    }
}