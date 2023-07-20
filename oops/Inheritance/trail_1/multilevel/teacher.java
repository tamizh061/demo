package mycodes.FundamentalJava.oops.Inheritance.trail_1.multilevel;

public class teacher //this is the parent class
{
    public static void  method(char[] Abcd) //one method is created
    {
        for(char newvar:Abcd){
            System.out.println(newvar);
        }
    }
    public static void main(String[] args) {
        char[] Abcd={'a','b','c','d'};
        method(Abcd); // method called
    }
}
