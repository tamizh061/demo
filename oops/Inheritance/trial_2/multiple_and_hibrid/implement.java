package mycodes.FundamentalJava.oops.Inheritance.trial_2.multiple_and_hibrid;

public class implement extends hibrid implements a,b,c
{

    @Override
    public void A() {
        System.out.println("A");
    }

    @Override
    public void B() {
        System.out.println("B");
    }

    @Override
    public void C() {
        System.out.println("C");
    }

    public static void main(String[] args) {
        implement obj =new implement();
        obj.A();
        obj.B();
        obj.C();
        HYBRID();
    }
}
