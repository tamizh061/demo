package mycodes.FundamentalJava.collection.set;
import java.util.HashSet;
public class hashset {

    //default order mainteind
    //allowing null valus
    public static void main(String[] args) {
        HashSet obj=new HashSet<>();
        System.out.println(obj);
        obj.add("a");
        obj.add("c");
        obj.add("f");
        obj.add("d");
        obj.add("h");
        obj.add("e");
        System.out.println(obj);
        obj.add(obj);
       // obj.remove(1);
        System.out.println(obj.size());
        obj.contains("f");
    }
}
