package mycodes.FundamentalJava.ArrayFolder.basicarray;


import java.util.Scanner;
//
//public class SearchingAnArray
//{
//    double[] monthwificharge={240,501.50,1000,1500,1200.75};
//
//    public void Implementation()
//    {
//        Scanner scan=new Scanner(System.in);
//        System.out.println("which category you want (monthly wifi charge)");
//        double userexpectation=scan.nextDouble();
//        for(int pos=0;pos<monthwificharge.length;pos++)
//        {
//            if(userexpectation==monthwificharge[pos])
//            {
//                System.out.println("your expectation value is "+userexpectation+" currently avilable in Jio/vodafone/airtel -type of position is"+pos);
//                return;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        SearchingAnArray search=new SearchingAnArray();
//        search.Implementation();
//    }
//}


public class SearchingAnArray
{
    double[] jio_recharges={188,2792,2782,6616,16161,828,22728,72812};
    public void arraysearchingmethod()
    {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter your recharge pack plan");
        double yourpack=scan.nextDouble();
        for (int index=0;index<jio_recharges.length;index++)
        {
            if(yourpack==jio_recharges[index])
            {
                System.out.println("you choosed plan index no: "+index);
                return;
            }
        }
    }

    public static void main(String[] args) {
        SearchingAnArray obj=new SearchingAnArray();
        obj.arraysearchingmethod();
    }
}
