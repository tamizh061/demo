package mycodes.FundamentalJava.consoleapplication;

import java.io.IOException;
import java.util.*;

public class Collectionprocess implements performance ,Runnable{
   Scanner scan=new Scanner(System.in);
ArrayList <android_customer_details> arr=new ArrayList <android_customer_details>();

     public Collectionprocess()
    {
        arr.add(new android_customer_details("tamil",2324,"mi","y1",223));
        arr.add(new android_customer_details("sivaa",22324,"vivo","vak",223));
    }

    synchronized public void run(){
        Collectionprocess obj=new Collectionprocess(); //create object to current class
        do {
            System.out.println("press 1 to add_details\npress 2 to list details\npress 3 deelete option\n press 4 update details\npress 5 sorting details\npress 6 to search");
            Scanner scan = new Scanner(System.in);
            int option = scan.nextInt();
            switch (option) {
                case 1:
                    System.out.println("add option enabled");
                    System.out.println("name" + "  " + "ph.no" + "  " + "mobile_brand" + "  " + "mobile_model" + "  " + "price");
                    android_customer_details details1 = new android_customer_details(scan.next(), scan.nextLong(), scan.next(), scan.next(), scan.nextInt());
                    obj.adddetails(details1);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("list option enabled");
                    System.out.println("costumer details");
                    obj.listout_details();
                    System.out.println();
                    break;
                case 3:
                    System.out.println(" delete option is enabled");
                    System.out.println("please enter name");
                    String namee = scan.next();
                    obj.delete(namee);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("update option enabled");
                    System.out.println("which person detail u want to update");
                    String name = scan.next();
                    obj.update(name);
                    System.out.println();
                    break;
                case 5:
                    System.out.println("which feild you want sort");
                    String options = scan.next();
                    obj.sorting(options);
                    break;
                case 6:
                    System.out.println("searching option enabled");
                    obj.searching();
                    break;
            }
        }
        while (true);
    }

    @Override
    public String adddetails(android_customer_details details) {
        arr.add(details);
        return details.getName()+" has been added succesfully";
    }
    @Override
    public void listout_details() {
        Iterator <android_customer_details> it =arr.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
    @Override
    public String delete(String name) {
       for (int i=0;i<arr.size();i++){
           if(arr.get(i).getName().equalsIgnoreCase(name)){
               System.out.println(arr.get(i).getName()+"has been deleted successfully");
               arr.remove(i);
               break;
           }
       }
        return name +"has been deleted successfully";
    }

    @Override
    public void update(String namee) {

        Scanner scan = new Scanner(System.in);
        try {
            for (int index = 0; index < arr.size(); index++) {
                if (arr.get(index) != null) {
                    if (arr.get(index).getName().equalsIgnoreCase(namee)) {
                        System.out.println(arr.get(index));
                        System.out.println("which field data you want update");
                        String usage = scan.next();
                        switch (usage) {
                            case "name":
                                System.out.println("your are choosen  name \n please tell us new value you are replaced");
                                String newvalue = scan.next();
                                arr.get(index).setName(newvalue);
                                System.out.println(arr.get(index).getName() + "has been updated succesfully");
                                break;
                            case "mobilebrand":
                                System.out.println("you choosen mobilebrand value\n please tell us updated hours value");
                                String newvalue1 = scan.next();
                                arr.get(index).setMobile_brand(newvalue1);
                                System.out.println(arr.get(index).getMobile_brand() + " has updated");
                                break;
                            case "ph.no":
                                System.out.println("you choosen ph.no value\n please tell us updated hours value");
                                Long newvalue2 = scan.nextLong();
                                arr.get(index).setPh_no(newvalue2);
                                System.out.println(arr.get(index).getMobile_brand() + " has updated");
                                break;
                            case "mobile model":
                                System.out.println("you choosen mobile model value\n please tell us updated hours value");
                                String newvalue3 = scan.next();
                                arr.get(index).setMobile_model(newvalue3);
                                System.out.println(arr.get(index).getMobile_model() + " has updated");
                                break;
                            case "price":
                                System.out.println("you choosen price value\n please tell us updated hours value");
                                int newvalue4 = scan.nextInt();
                                arr.get(index).setPrice(newvalue4);
                                System.out.println(arr.get(index).getPrice() + " has updated");
                                break;
                        }

                    }
                }
                else {
                    continue;
                }
            }

        } catch (NullPointerException NE) {
            System.out.println("invalid input");
            listout_details();
            System.out.println("please enter a valid input");
            namee = scan.next();
            update(namee);
        }
    }
    @Override
    public void sorting(String options) {
         ArrayList<android_customer_details> dublicatte_arr=new ArrayList<android_customer_details>();
       dublicatte_arr.addAll(arr);
        try {

            System.out.println("sorting option enabled");
            android_customer_details referance;
            for (int i = 0; i < dublicatte_arr.size(); i++) {
                for (int j = i + 1; j < dublicatte_arr.size(); j++) {
                    if (options.equalsIgnoreCase("name")) {
                        if (dublicatte_arr.get(j)!= null) {
                            if (dublicatte_arr.get(i).getName().compareTo(dublicatte_arr.get(j).getName()) > 0) {
                                referance = dublicatte_arr.get(i);
                                dublicatte_arr.set(i,dublicatte_arr.get(j));
                                dublicatte_arr.set(j, referance);
                            }
                            else {

                            }
                        }

                    } else if (options.equalsIgnoreCase("ph_no")) {
                        if (dublicatte_arr.get(j)!= null) {
                            if (dublicatte_arr.get(i).getPh_no()>(dublicatte_arr.get(j).getPh_no())) {
                                referance = dublicatte_arr.get(i);
                                dublicatte_arr.set(i,dublicatte_arr.get(j));
                                dublicatte_arr.set(j, referance);
                            }
                            else {

                            }
                        }
                    }
                    else if (options.equalsIgnoreCase("mobile_brand")) {
                        if (dublicatte_arr.get(i).getMobile_brand().compareTo(dublicatte_arr.get(j).getMobile_model())> 0) {
                            referance = dublicatte_arr.get(i);
                            dublicatte_arr.set(i,dublicatte_arr.get(j));
                            dublicatte_arr.set(j, referance);
                        }
                        else {

                            }
                        }
                else if (options.equalsIgnoreCase("mobile_model")) {
                        if (dublicatte_arr.get(i).getMobile_model().compareTo(dublicatte_arr.get(j).getMobile_model()) > 0) {
                            referance = dublicatte_arr.get(i);
                            dublicatte_arr.set(i,dublicatte_arr.get(j));
                            dublicatte_arr.set(j, referance);
                        }
                        else {

                            }
                        }

                else if (options.equalsIgnoreCase("price")) {
                        if (dublicatte_arr.get(j)!= null) {
                            if (dublicatte_arr.get(i).getPrice()>(dublicatte_arr.get(j).getPrice())) {
                                referance = dublicatte_arr.get(i);
                                dublicatte_arr.set(i,dublicatte_arr.get(j));
                                dublicatte_arr.set(j, referance);
                            }
                            else {

                            }
                        } else {
                            System.out.println("sorting failed");
                        }
                    }
                }
            }
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }
        //listing the dublicate array
        Iterator it=dublicatte_arr.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    @Override
    public void searching() {
        int ref = 0;
        for (int i=0;i<arr.size();i++){
            if(arr.get(i)!=null){
                ref+=1;
            }
        }
        System.out.println("which field you want to search");
        Scanner scann = new Scanner(System.in);
        String srch = scann.next();
        System.out.println("please enter "+srch+" details");
        if (srch.equalsIgnoreCase("name")||srch.equalsIgnoreCase("mobile_brand")||srch.equalsIgnoreCase("mobile_model")) {
            String opt_1 = scann.next();
            for (int i = 0; i <ref; i++) {
                if (arr.get(i).getName().equalsIgnoreCase(opt_1) || arr.get(i).getMobile_brand().equalsIgnoreCase(opt_1) || arr.get(i).getMobile_model().equalsIgnoreCase(opt_1)) {
                    System.out.println(arr.get(i));
                }
            }
        }
        else if (srch.equalsIgnoreCase("price")) {
            int opt_1 = scann.nextInt();
            for (int i = 0;i<ref;i++) {
                if (arr.get(i).getPrice() == opt_1 || arr.get(i).getPh_no() == opt_1) {
                    System.out.println(arr.get(i));
                }
            }
        }
        else if (srch.equalsIgnoreCase("ph_no")){
            long opt_1 = scann.nextLong();
            for (int i = 0;i<ref;i++) {
                if (arr.get(i).getPrice()==opt_1||arr.get(i).getPh_no()==opt_1) {
                    System.out.println(arr.get(i));
                }
            }
        }
    }

    @Override
    public void logs(String log_name) throws IOException, ClassNotFoundException {

    }


}
