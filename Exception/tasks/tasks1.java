package mycodes.FundamentalJava.Exception.tasks;

import java.util.Scanner;

public class tasks1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
        String array[] =new String[10];
        array=null;
        for (int i=0;i<array.length;i++) {
            System.out.println(array[i]);
        }
        }
        catch (NullPointerException NE){
            System.out.println("nullpointer error is occured");
        }
        finally {
            System.out.println("code runned successfully");
        }
    }
}