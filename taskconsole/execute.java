package mycodes.FundamentalJava.taskconsole;
import lombok.AllArgsConstructor;
import lombok.Synchronized;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class execute  implements performance,Runnable {
    HashSet<declare_var> obj = new HashSet<declare_var>();
    synchronized public void run(){
        execute exe=new execute();
        do{
            System.out.println("1.add"+"2.list"+"3.update"+"4.delete"+"5.sort"+"6.search");
            Scanner scn=new Scanner(System.in);
            int value=scn.nextInt();
            switch ( value){
                case 1:
                    System.out.println("names  "+"price  "+"weight  "+"ratimgs  ");
                    declare_var aa=new declare_var(scn.next(),scn.nextInt(),scn.nextDouble(),scn.nextInt());
                    exe.add_details(aa);
                    break;
                case 2:
                    exe.listal_details();
                    break;
                case 3:
                    System.out.println("which fruite detail u want to update");
                    String ref=scn.next();
                    exe.update_details(ref);
            }
        }
        while (true);
    }
    @Override
    public String add_details(declare_var VALL) {
        obj.add(VALL);
        return VALL.getNames()+"Added successfully";
    }
    @Override
    public void delete_details(String VAL) {

    }
    @Override
    public void listal_details() {
        Iterator it= obj.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
    @Override
    public void update_details(String REF) {

    }
    @Override
    public void sort_details() {
    }
    @Override
    public void searching_details() {

    }
}
