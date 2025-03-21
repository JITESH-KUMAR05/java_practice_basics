import java.util.*;

public class LL {
    public static void main(String args[]){
        LinkedList<String> ll = new LinkedList();
        ll.add("a");
        ll.add("b");
        ll.add("c");

        Iterator<String> it = ll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
