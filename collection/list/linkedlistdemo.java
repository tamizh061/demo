package mycodes.FundamentalJava.collection.list;
import java.util.LinkedList;

public class linkedlistdemo {
    public static void main(String[] args) {
        LinkedList obj=new LinkedList();
        obj.add("tamil");
        obj.add("praveen");
        obj.add("siva");
        obj.addFirst("tom");
        obj.addLast("jerry");
        obj.addAll(obj);
        obj.add(2,"thiyagu");
        System.out.println(obj.contains("tamil"));
        System.out.println(obj.indexOf("praveen"));
        System.out.println(obj);
        System.out.println(obj.getFirst());
        System.out.println(obj.getLast());
        System.out.println(obj.get(2));
        System.out.println(obj.peek());
        System.out.println(obj.pop());
        System.out.println(obj.remove("tamil"));
        System.out.println(obj.removeFirst());
        System.out.println(obj);
        System.out.println(obj.removeLast());
        System.out.println(obj.remove(2));
        System.out.println(obj);
    }
}
