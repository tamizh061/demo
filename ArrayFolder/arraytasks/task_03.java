package mycodes.FundamentalJava.ArrayFolder.arraytasks;

import java.util.Scanner;


public class task_03 {
    String[] student_names =new String[10];

    public void  function()
    {
        System.out.println("please enter student_names");
        for (int index = 0;index<student_names.length;index++)
        {
            Scanner scan=new Scanner(System.in);
            student_names[index]=scan.next();
        }
        int count=student_names.length;
       for(int pos=0;pos<=student_names.length;pos++)
       {
           if(pos>0)
           {
          int printvar=student_names.length-pos;
           System.out.println("Your studaent name "+count+" : "+student_names[printvar]);
           count--;
           }
       }
    }
    public static void main(String[] args)
    {
       task_03 obj =new task_03();
       obj.function();
    }
}
