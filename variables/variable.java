package mycodes.FundamentalJava.variables;

public class variable {
    static int age_1=23; //static variable within class
    static int age_2=25;
    int num=1222; //global variable  if u want print  this must be use method option
    public  void demomethod(){
        int local_variable=7777; //within class but whithin the method
        System.out.println(num);
        System.out.println(age_1);
        System.out.println(local_variable);
    }
    public static void main(String[] args) {
       int data =100; // instance variable -within class but within main function
        System.out.println(data);
        System.out.println(age_2);
        variable demoobject= new variable();//creating object for print method inner functions
        demoobject.demomethod();
    }
}
