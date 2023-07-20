package mycodes.FundamentalJava.oops.Inheritance.trail_1.multiple;

public interface user_03 extends user_02{
    public void user_03_method();
    user_03 objj=new user_03() {
        @Override
        public void user_03_method() {
            System.out.println("hii");
        }

        @Override
        public void user_02_method() {

        }
    };

    public static void main(String[] args) {
        objj.user_03_method();
    }
}
