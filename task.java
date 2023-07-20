package mycodes.FundamentalJava;
import java.util.Arrays;
import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
//        System.out.println("enter row size");
//        int rows = obj.nextInt();
//        System.out.println("enter colum n size");
//        int columns = obj.nextInt();
        int[][] arrayvalues = {{12, 34, 56, 78, 67}, {12, 32, 65, 89, 78}, {99, 9, 91, 24, 31,}, {77, 88, 98, 22, 33}};
//        int[][] arrayvalues = new int[rows][columns];

        System.out.println(arrayvalues.length);
        System.out.println();
//        for (int row = 0;row < arrayvalues.length;row++) {
//            System.out.println();
//            for (int column=0;column<arrayvalues[row].length;column++){
//                arrayvalues[row][column]=obj.nextInt();
//            }
//        }
        for (int i = 0; i < arrayvalues.length; i++) {
            for (int j = 0; j < arrayvalues[i].length; j++) {
                if (i == 0) {
                    System.out.print(arrayvalues[i][j]);
                }
                System.out.println();
                if (i == 1) {
                    int num = 0;
                    for (int a = arrayvalues[i].length; a > num; ) {
                        a -= 1;
                        System.out.print(arrayvalues[i][a]);
                        System.out.println();
                    }
                    break;
                }

                if (i == 2) {
                    for (int a = 0; a < 1; a++) {
                        System.out.println(arrayvalues[i][a]);
                    }
                    break;
                }
                if (i == 3) {
                    for (int b = 0; b < 1; b++) {
                        System.out.println(arrayvalues[i][b]);
                    }
                    break;
                }
            }
        }

        for (int d = 0; d < arrayvalues.length; d++) {
            for (int e = 0; e < arrayvalues[e].length; e++) {

            }
        }
    }
}
