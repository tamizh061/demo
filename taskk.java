package mycodes.FundamentalJava;

import java.util.Arrays;

public class taskk {
    public static void main(String[] args) {
        int[][] arrayvalues = {{12, 34, 56, 78, 67}, {12, 32, 65, 89, 78}, {99, 9, 91, 24, 31,}, {77, 88, 98, 22, 33}};//given array valuse
        int[] array_1 = new int[arrayvalues[0].length];//index0
        int[] array_2 = new int[arrayvalues[0].length];//index1
        int[] array_3 = new int[arrayvalues[0].length];//index2
        int[] array_4 = new int[arrayvalues[0].length];//index3

        int[][] output = new int[arrayvalues.length][arrayvalues[0].length];//modified values are insert in this 2d array
        int[] lastoutput = new int[20];//2d array to singlle array change
        for (int i = 0; i < arrayvalues[0].length; i++) {
            array_1[i] = arrayvalues[0][i];
            array_2[i] = arrayvalues[1][i];
            array_3[i] = arrayvalues[2][i];
            array_4[i] = arrayvalues[3][i];
        }
        for (int a = 0; a < arrayvalues[0].length; a++) {
            output[0][a] = array_1[a];
        }
        int b = 0;
        for (int a = 4; 0 <= a; a--) {
            output[1][b] = array_2[a];
            b += 1;
        }
        for (int i = 0; i < arrayvalues[0].length; i++) {

            if (i == 2) {
                output[2][0] = array_3[0];
                output[2][1] = array_4[0];
                output[2][2] = array_4[1];
                output[2][3] = array_3[1];
                output[2][4] = array_3[2];
            }
            if (i == 3) {
                output[3][0] = array_3[3];
                output[3][1] = array_3[4];
                output[3][2] = array_4[4];
                output[3][3] = array_4[3];
                output[3][4] = array_4[2];
            }
        }
        for (int increaser = 0; increaser < 20; ) {
            for (int i = 0; i < output.length; i++) {
                for (int j = 0; j < output[0].length; j++) {
                    lastoutput[increaser] = output[i][j];
                    increaser++;
                }
            }
            System.out.println(Arrays.toString(lastoutput));
        }
    }
}