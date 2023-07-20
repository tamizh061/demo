package mycodes.FundamentalJava.operators;
public class operators {
    /*
8types of operators
1.arithmatic operators
2.assignment operators
3.logical operators
4.relational operator or camparision operator
5.bitewise operator
6.shift
7.unary operator
8.ternary operator
*/
    public static void main(String[] args){
    //1.arithmatic operators
        int apple_price=100;
        int orange_price=40;
        int mango_price=50;
        int others=300;
        int total=apple_price+orange_price+mango_price+others;
        int without_appleprice=total-apple_price;
        int perecentage_orangeprice=total/apple_price;
        int modulus=apple_price%total;
        System.out.println("overall purchase amount:"+total);
        System.out.println("apple price necklated after others total price:"+without_appleprice);
        System.out.println("divided by apple in total:"+perecentage_orangeprice);
        System.out.println("modulus method output:"+modulus);
        //2.assignment operators
        int demo_var=100;
         demo_var+=30;  //addition
        System.out.println("assignment operator addition value is: "+demo_var);
         demo_var-=40;  //supraction
        System.out.println("assignment operator suppraction value is :"+demo_var);
         demo_var*=100;  //multiplication
        System.out.println("assignment operator multiplication value is :"+demo_var);
         demo_var/=2;    //division
        System.out.println("assignment operator division value is :"+demo_var);
         demo_var %=2; //modulus
        System.out.println("assignment operator modulus value is :"+demo_var);

        //3.logical operator
        Boolean case1=true;
        Boolean case2=false;
        System.out.println(case1&&case2); //LOGICAL AND
        System.out.println(case1||case2);//LOGICAL OR
        System.out.println(!case2); // LOGICAL NOT

        //4.relational or comparision operator
        int one_kgcake=100;
        int two_kgcake=200;
        int three_kgcake=300;
        System.out.println(one_kgcake>=two_kgcake);//greater than equal
        System.out.println(two_kgcake<one_kgcake);//less than equal
        System.out.println(three_kgcake==one_kgcake);//equal to equal
        //5.bitwise operator
        int a =505;
        int b=890;
        System.out.println(a&b);//bitwise AND
        System.out.println(a|b);//bitewise Inclusive OR
        System.out.println(a^b);//bitewise  Exclusive OR

       //6.shift operator
        System.out.println(a>>b); //a/2^b right shift operator
        System.out.println(a<<b); //a*2^b left shift operator
    }
}
