package mycodes.FundamentalJava.oops.Inheritance.tasks.usingsingle;

import java.util.Scanner;

public class class_01 {
    public static void method(int[] boys) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter what index number you need");
        int var = scan.nextInt();
        //control structure
        if (var <= 9) {
            System.out.println(boys[var]);
        } else {
            System.out.println("you given index number not available");
        }
    }
        public static void main(String[] args){
            //array
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};//array
            method(array);
        }
    }

