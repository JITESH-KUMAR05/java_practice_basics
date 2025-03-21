import java.util.*;

public class Hset{
    public  static void main(String Args[]){
        HashSet<String> hs = new HashSet();
        hs.add("jitesh");
        hs.add("jyo");
        hs.add("teja");
        hs.add("vd");
        hs.add("vnil");
        System.out.println("initial hashset : " + hs);
        hs.removeIf(str -> str.contains("j"));
        System.out.println("removed hashset : " + hs);

    }
}