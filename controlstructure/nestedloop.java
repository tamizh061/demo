package mycodes.FundamentalJava.controlstructure;

import java.sql.SQLOutput;
import java.util.Scanner;
public class nestedloop {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int age=scan.nextInt();
        if(age>=18)//outer block
        {
            System.out.println("You are not eligble for voter list");
            if (age>=27 && age<=27) {
                System.out.println("your eligible to marriage");
            }
            else {
                    System.out.println("your age over limited");
                }

        }
        else{
            System.out.println("your age is below 18,so your are childish person");
        }

    }
}
