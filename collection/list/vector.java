package mycodes.FundamentalJava.collection.list;
import java.util.Vector;
public class vector {
    public static void main(String[] args) {
        Vector obj=new Vector<>();
        obj.add("tom");
        obj.add(1,"tamil");
        obj.addAll(obj);
        obj.contains("tom");
//       obj.remove(0);
//       obj.remove("tamil");
        System.out.println(obj.containsAll(obj));
        System.out.println(obj.lastElement());
        System.out.println(obj.firstElement());
        System.out.println(obj);
    }
}
