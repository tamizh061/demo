package mycodes.FundamentalJava.ArrayFolder.basicarray;
import java.util.Scanner;

public class arrayinsertion {
    public static void main(String[] args) {
        int[] frnds=new int[10];
        Scanner scanobj=new Scanner(System.in);
        int counts=100;
        for(int index=0;index<frnds.length;index++) {
               counts+=1;
               frnds[index]=counts;
        }
        for(int newvar:frnds){
            System.out.println(newvar);
        }
    }
}


