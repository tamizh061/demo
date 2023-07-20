package mycodes.FundamentalJava.collection.map;


import java.util.TreeMap;

public class Treemap
{
    public static void main(String[] args) {
        TreeMap<String,Integer> obj=new TreeMap<>();
        obj.put("age1",12);
        obj.put("age3",28);
        obj.put("age2",17);
        System.out.println(obj);
        System.out.println(obj.get("age1"));
        System.out.println(obj.containsKey("age2"));
        }
    }

