package mycodes.FundamentalJava.Fullstackk;

import mycodes.FundamentalJava.Fullstackk.datas.Furnitures;
import mycodes.FundamentalJava.Fullstackk.datas.grocery;
import mycodes.FundamentalJava.Fullstackk.datas.mobiless;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class maain implements performance{
    ArrayList<grocery> gr = new  ArrayList<grocery>();
    public maain(){
        gr.add(new grocery("a",1,2));
        gr.add(new grocery("b",2,3));
        gr.add(new grocery("c",3,4));
    }
    public static void main(String[] args) {
        maain execute=new maain();
        Scanner scan=new Scanner(System.in);
        do {
            System.out.println("1.add" + "\n" + "2.list" + "\n" + "3.update" + "\n" + "4.delete" + "\n" + "5.sort" + "\n" + "6.search");
            int newvalue = scan.nextInt();
            switch (newvalue) {
                case 1:
                    grocery det = new grocery(scan.next(), scan.nextInt(), +scan.nextInt());
                    execute.addd(det);
                    break;
                case 2:
                    execute.listtt();
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
            }
        }
        while (true);
    }
    @Override
    public String addd(grocery details) {
        gr.add(details);
        return details.getName()+"has been added successfuly";
    }
    @Override
    public String addd(mobiless details) {
        return null;
    }

    @Override
    public String addd(Furnitures details) {
        return null;
    }

    @Override
    public void listt(String type) {

    }

    @Override
    public void listtt() {
        Iterator it= gr.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }

    @Override
    public String updatee(grocery details) {
        return null;
    }

    @Override
    public String updatee(mobiless details) {
        return null;
    }

    @Override
    public String updatee(Furnitures details) {
        return null;
    }

    @Override
    public String Sortt(grocery details) {
        return null;
    }

    @Override
    public String Sortt(mobiless details) {
        return null;
    }

    @Override
    public String Sortt(Furnitures details) {
        return null;
    }
}
