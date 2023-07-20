package mycodes.FundamentalJava.collection.map;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        //hashmap haves default reverse order
        HashMap <String,Integer> obj=new HashMap<>();
        obj.put("age1",23);
        obj.put("age2",16);
        obj.put("age3",25);
        obj.put("age4",29);
        System.out.println(obj);
        System.out.println(obj.get("age1"));
        System.out.println(obj.keySet());
        System.out.println(obj.values());
        //gettinmg key only
        for(Map.Entry<String,Integer> mm:obj.entrySet()){
            System.out.println(mm.getKey());
        }
        //getting value only
        for(Map.Entry<String,Integer> mm:obj.entrySet()){
            System.out.println(mm.getValue());
        }
        //getting key and value pair
        for(Map.Entry<String,Integer> mm:obj.entrySet()){
            System.out.println(mm);
        }
    }
}
