package mycodes.FundamentalJava.ArrayFolder.basicarray;
import java.util.Arrays;
import java.util.Scanner;
public class UpdatingAnArray
{
    public static void main(String[] args)
    {
        Long[] ElectricityBillNo={875466387617873l,3877636536722l,832763657663l,472767635267367378l,678673676737672l,127873882l};

        replacingInArray(ElectricityBillNo);

    }
    public static void replacingInArray(Long[] EBBILL)
    {
        System.out.println("before updating an Eb bill statement"+ Arrays.toString(EBBILL));
        Scanner scan=new Scanner(System.in);
        System.out.println("which index of EB Bill value ");
        int index=scan.nextInt();
        System.out.println(EBBILL[index]+" in this no is your EB bill no,you edit this bill no,");
        Long newvalue=scan.nextLong();
        EBBILL[index]=newvalue;
        System.out.println("After updating an Eb bill statement"+ Arrays.toString(EBBILL));
    }

    //   MY WORK OUT
/*
public static void main(String[] args) {
        Long[] roll_number ={875466387617873l,3877636536722l,832763657663l,472767635267367378l,678673676737672l,127873882l};
        replacearray(roll_number);
}
public static void  replacearray (Long[] update){
    System.out.println("befor update in  your students reg numbers : "+Arrays.toString(update));
    Scanner scan=new Scanner(System.in);
    System.out.println("please enter which index of roll u want to update ");
    int givenindex=scan.nextInt();
    System.out.println("selected index :"+givenindex);
    System.out.println("pleaase give new value :");
    Long new_value=scan.nextLong();
    if(update.length>givenindex)
    {
    update[givenindex]=new_value;
    System.out.println("after update in  your students reg numbers : "+Arrays.toString(update));
    }
    else
    {
        System.out.println("you gived idex number is not available in rollnumber");
    }
    };
*/
}
