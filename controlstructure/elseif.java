package mycodes.FundamentalJava.controlstructure;

public class elseif {
    public static void main(String[] args) {
        int tamil=23 ;
        int sivakumar = 25;
        int tamilselvam = 19;
        if((sivakumar>tamil)||(sivakumar<tamilselvam))
        {
            System.out.println("sivakumar is helder brother");
        }
        else if((sivakumar<tamilselvam)||(tamil<sivakumar)){
            System.out.println("failed");
        }
        else {
            System.out.println("defualt");

    }
    }
}


