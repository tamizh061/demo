package mycodes.FundamentalJava.ArrayFolder.basicarray;
import java.util.Arrays;
public class arraycreation {
        public static void main(String[] args){
            String[] fruit_names = {"apple","orange","mango","banana"};
            //  System.out.println(fruit_names);only shown an address values
            System.out.println(Arrays.toString(fruit_names));
            //  System.out.println(fruit_names.length);used for count length
            for(int index = 0; index < fruit_names.length; index++)
              {
                System.out.println(fruit_names[index]);
              }
        }
    }

