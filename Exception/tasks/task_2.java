package mycodes.FundamentalJava.Exception.tasks;

import java.io.IOException;
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();
        Process pro;
        String[] array = { "DpiScaling"};
        for (int i = 0; i < array.length; i++) {
            try {
                pro = run.exec(array[i]);
               Thread.sleep(5000);
            }
            catch (IOException IE) {
                System.out.println("input output error  is occured "+array[i]+" is not opend");
            }
            catch (NullPointerException ne) {
                System.out.println("null is occured becuase inde number "+i+" having null value ");
            }
            catch (InterruptedException e) {
                System.out.println("waiting or slepping erorr is occured");
            }
        }
    }
}

