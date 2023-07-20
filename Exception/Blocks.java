package mycodes.FundamentalJava.Exception;

import java.util.Scanner;

public class Blocks
{
    public static void main(String[] args)
    {
        try
        {
            Scanner scan=new Scanner(System.in);
            System.out.println("what is your a value");
            int a=scan.nextInt();
            System.out.println("what is your b value");
            int b=scan.nextInt();
            int c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException AE)
        {
            System.out.println(AE+" your second value not divided by zero");
            Scanner scan=new Scanner(System.in);
            System.out.println("what is your a value");
            int a=scan.nextInt();
            System.out.println("what is your b value");
            int b=scan.nextInt();
            int c=a/b;
            System.out.println(c);}
        finally
        {
            System.out.println("Thankyou");
        }

    }
}