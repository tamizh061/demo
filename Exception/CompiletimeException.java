package mycodes.FundamentalJava.Exception;

import java.io.IOException;
public class CompiletimeException
{
    public static void main(String[] args)
    {
        //classname/datatype  var  = classname methodname;
        Runtime run=Runtime.getRuntime();    //classname refvar=classname.method
        Process pro;
        try
        {
            pro=run.exec("notepad");
            Thread.sleep(10000);
            pro=run.exec("mspaint");
        }
        catch (IOException ioException)
        {
        }
        catch(InterruptedException ie)
        {
        }
    }
}
//class sample
//{
//    static sample sam=new sample();
//
//    public static sample getsample()
//    {
//        return sam;
//    }
//}



//class Runtime
//{
//    public Runtime()//def constructor         // accessmodifier classname
//    {
//    }
//    private static Runtime run=new Runtime();   //accessmodifier static returntypeasclass refvar=keyword constryuctor
//    public static Runtime getRuntime()          //    accessmodifier static returnclasstype methodname
//    {
//        return  run;
//    }
//
//}


//constructor
//private static object
//public static method
