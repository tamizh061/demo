package mycodes.FundamentalJava.oops.Inheritance.tasks.usingmultilevel;

import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class store1 {
    //scanner
    //looping
    //type casting
    public static void main(String[] args) {
        int [ ] prices={232,474,733,626,26,2727,82,737};

        method(prices);
    }
    public static void method(int[] amount) {
        String[] fruitnames = {"1.apple", "2.orange", "3.mango", "4.banana", "5.graps", "6.pinapple", "7.papaya", "8.watermelon"};
        //looping
        for (String newvar : fruitnames) {
            System.out.println(newvar);
        }



        for (int index = 0; index <= amount.length; index++){
            System.out.println("which fruit price you want");
            Scanner scan = new Scanner(System.in);  //scanner
            long get = scan.nextLong();
            int gets = (int) get - 1;   //typecasting
            System.out.println("you selected fruitename is" + " " + fruitnames[gets] + " " + "ant it's price is " + " " + amount[gets]);
            System.out.println();
    }
    }
}