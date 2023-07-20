package mycodes.FundamentalJava.ArrayFolder.advanced;
import java.util.Scanner;
    public class MultiDimensionalArray
    {
        public static void main(String[] args)
        {
//        Datatype [][] variableName={{},{},{},{}};

//        String [][] SetofPeopleLanguages={{"Tamil","Hindi","Telugu"},{"Malayalayam","urudu","Tamil"},{"Telugu","Kannada","English"}};
//
//        for(int row=0;row<3;row++)
//        {
//            for(int column=0;column<=2;column++)
//            {
//                System.out.print(SetofPeopleLanguages[row][column]+" ");//SetofPeopleLanguages[0][0].[0][1],[0][2],[1][0],[1][1],[1][2]
//            }
//            System.out.println();
//        }

            int floorcount=3;
            int roomscount=2;

            String [][] GokulamHospital=new String[floorcount][roomscount];
            Connection(GokulamHospital);



            for(String hospital1[]:GokulamHospital )
            {
                for(String hospital: hospital1)
                {
                    System.out.print(hospital+" ");
                }
                System.out.println();
            }
        }
        public static void Connection(String [][] Hospital)
        {
            Scanner scan=new Scanner(System.in);
            for(int i=0;i< Hospital.length;i++)
            {
                for(int j=0;j< Hospital[i].length;j++)
                {
                    System.out.println("current floor no "+i+" room no is "+j+" patient name is : ?");
                    Hospital[i][j]=scan.next();
                }
            }
        }

    }

