package mycodes.FundamentalJava.Exception.tasks;

import java.util.Scanner;

public class task_3 {
    Scanner scan = new Scanner(System.in);
    int a;
    int b;
    String name = "hjxbdhhbdjbhausbxub aksjcb kjbkhdbk";
    String name1;
    public void method(){
        try {
        System.out.println("enter firdt");
        a = scan.nextInt();
        System.out.println("enter last");
        b = scan.nextInt();
        System.out.println(name.substring(a, b));
    } catch (StringIndexOutOfBoundsException er) {
        System.out.println("enter firdt");
        a = scan.nextInt();
        System.out.println("enter last");
        b = scan.nextInt();
        System.out.println(name.substring(a, b));
    }
    }
    public static void main(String[] args) {
        task_3 eee=new task_3();
        eee.method();

    }
}
