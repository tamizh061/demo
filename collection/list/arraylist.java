package mycodes.FundamentalJava.collection.list;
import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> obj= new ArrayList<>();
        System.out.println(obj);
        obj.add(1);
        obj.add(3);
        obj.add((2));
        obj.add(1);
        obj.add(2,2);
        obj.addAll(obj);
        System.out.println(obj);
        obj.remove(0);
        System.out.println(obj);
        System.out.println(obj.contains(2));
        System.out.println(obj.isEmpty());
        obj.clear();
        System.out.println(obj);
    }
}

