package mycodes.FundamentalJava.collection.set;
import lombok.AllArgsConstructor;

import java.util.Iterator;
import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
//           if normal data type use

        TreeSet<String> obj=new TreeSet<>();
        obj.add("tamil");
        obj.add("aravindh");
        obj.add("praveen");
        System.out.println(obj);

//         if  constructor data type used
//        TreeSet <details> obj=new TreeSet<details>();
//        obj.add(new details("tamil",23,"ghss","be mech"));
//        Iterator ite= obj.iterator();
//        while (ite.hasNext()){
//            System.out.println(ite.next());
//        }
//    }
}
//@AllArgsConstructor
//class details implements Comparable<details>{
//    private  String name;
//    private  int age;
//    private  String schooling;
//    private String degree;
//
//    @Override
//    public String toString() {
//        return "details "+
//                " name : "+this.name+
//                " age : "+this.age+
//                " schooling: "+this.schooling+
//                " degree: "+this.degree;
//    }
//
//    @Override
//    public int compareTo(details o) {
//        return this.name.compareTo(o.name);
//    }
}