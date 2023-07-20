package mycodes.FundamentalJava.oops.Inheritance.trail_1.multilevel;

public class student_01 extends teacher // teacher class is called
{
    public static void method_02(int[] numbers) //this class method one created
    {
        for(int newvar1:numbers){
            System.out.println(newvar1);
        }
    }
    public static void main(String[] args) {
        char[] Abcd={'e','f','g','h'};
        int[] numbers={1,2,3,4};
        method(Abcd);//teacher class is accesed and called
        method_02(numbers);//this class method one called
    }
}
