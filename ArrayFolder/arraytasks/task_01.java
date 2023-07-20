package mycodes.FundamentalJava.ArrayFolder.arraytasks;

import java.util.Scanner;
public class task_01 {
 public static void demomethod() {
   int[] names=new int[10];
   Scanner scnobj=new Scanner(System.in);
   int count=0;
   for(int index=0;index<names.length;index++){
     count+=1;
     System.out.println("enter your"+" "+"name"+" "+count);
     names[index]=scnobj.nextInt();
   }
     for(int newnames:names){
         System.out.println(newnames);
     }
 }
  public static void main(String[] args) {
   demomethod();
  }
}
