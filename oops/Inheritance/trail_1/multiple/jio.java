package mycodes.FundamentalJava.oops.Inheritance.trail_1.multiple;

public class jio implements user_01,user_03 // interface classes called
{

    @Override
    public void user_01_method()
    {
        String  name_01="tamil";
        System.out.println("hi"+" "+name_01);
    }

    @Override
    public void user_02_method() {
        String  name_02="siva";
        System.out.println("hi"+" "+name_02);
    }

    @Override
    public void user_03_method() {
        String  name_03="praveen";
        System.out.println("hi"+" "+name_03);
    }

    public static void main(String[] args) {
       jio obj=new jio();
       obj.user_01_method();
       obj.user_02_method();
       obj.user_03_method();
    }
}
