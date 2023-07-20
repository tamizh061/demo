package mycodes.FundamentalJava.scanner;

import java.util.Scanner;
public class getinput {
    public static void main(String[] args) {
        Scanner scan_obj = new Scanner(System.in);
        System.out.println("enter the first name:");
        String first_name = scan_obj.next();
        System.out.println("your first name is :" + first_name);
        System.out.println("enter you second name:");
        String second_name = scan_obj.next();
        System.out.println("your second name is :" + second_name);
        System.out.println("enter your age:");
        int age = scan_obj.nextInt();
        System.out.println("your age is " + age);
    }
}


