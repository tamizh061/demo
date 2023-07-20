package mycodes.FundamentalJava.oops.encapsulation.trail_2;

public class implementvar extends declare_var {
    public static void main(String[] args) {
        implementvar obj = new implementvar();
        obj.setprice(1234);
        obj.setcarname("aadi");
        obj.setlocation("chennai");
        System.out.println( obj.getprice());
        System.out.println(obj.getcarname());
        System.out.println(obj.getLocation());
    }
}
