package mycodes.FundamentalJava.controlstructure;


import java.util.Scanner;

public class ifclass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your wight");
        int wight=scan.nextInt();
        anotheronemethod("tom");
        if (wight>=160)
        {
            System.out.println("please conusult your doctor becuase your wight is over");
        }
        else {
            System.out.println("healthy body");
        }
    }
    public static void anotheronemethod(String username){
        if ("tamil"==username){
            System.out.println("hi"+username);
        }
        else {
            System.out.println("invalid user");
        }
    }




}
