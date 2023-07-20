package mycodes.FundamentalJava.consoleapplication;
import java.io.IOException;
import java.util.Scanner;
public class excution_all implements performance ,Runnable{
    android_customer_details[] array = new android_customer_details[10];
    Scanner scan = new Scanner(System.in);
    synchronized public void run(){
        excution_all obj=new excution_all(); //create object to current class
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
     excution_all() {
         array[0] = new android_customer_details("bhashaa", 18973007, "vivo", "v23", 28000);
         array[1] = new android_customer_details("annamalai", 189899800, "mi", "y1", 200012);
     }
    @Override
    public String adddetails(android_customer_details details) {
        try {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == null) {
                    array[i] = details;
                    return details.getName()+"has been added succesfully";
                }
            }
            throw new androidexception();
        }
        catch (androidexception ande) {
            System.out.println(ande +"so must be dlt any one member details");
            System.out.println("which index u want to delete");
            for(android_customer_details names:array ){
                System.out.println(names.getName());
            }
            String New=scan.next();
            delete(New);
            adddetails(details);
        }
        return details.getName()+" has  been added -successfully";
    }

    @Override
    public void listout_details() {
        int a = 1;
        for (android_customer_details print : array) {
            System.out.println(print);
        }
    }
    public String delete(String name) {
        try{
        for(int index=0;index<array.length;index++)
        {
            if(array[index].getName().equalsIgnoreCase(name))
            {
                array[index]=null;
                System.out.println(name+" has been deleted successfully");
                break;
            }
        }}
        catch (NullPointerException NE){
            System.out.println("don't give null value");
            System.out.println("please correct formet enter name");
            String NEW=scan.next();
            delete(NEW);
        }
        return name+" has not been deleted";
    }

    @Override
    public void update(String namee) {
        Scanner scan = new Scanner(System.in);
        try {
            for (int index = 0; index < array.length; index++) {
                if (array[index] != null) {
                    if (array[index].getName().equalsIgnoreCase(namee)) {
                        System.out.println(array[index]);
                        System.out.println("which field data you want update");
                        String usage = scan.next();
                        switch (usage) {
                            case "name":
                                System.out.println("your are choosen  name \n please tell us new value you are replaced");
                                String newvalue = scan.next();
                                array[index].setName(newvalue);
                                System.out.println(array[index].getName() + "has been updated succesfully");
                                break;
                            case "mobilebrand":
                                System.out.println("you choosen mobilebrand value\n please tell us updated hours value");
                                String newvalue1 = scan.next();
                                array[index].setMobile_brand(newvalue1);
                                System.out.println(array[index].getMobile_brand() + " has updated");
                                break;
                            case "ph.no":
                                System.out.println("you choosen ph.no value\n please tell us updated hours value");
                                Long newvalue2 = scan.nextLong();
                                array[index].setPh_no(newvalue2);
                                System.out.println(array[index].getMobile_brand() + " has updated");
                                break;
                            case "mobile model":
                                System.out.println("you choosen mobile model value\n please tell us updated hours value");
                                String newvalue3 = scan.next();
                                array[index].setMobile_model(newvalue3);
                                System.out.println(array[index].getMobile_model() + " has updated");
                                break;
                            case "price":
                                System.out.println("you choosen price value\n please tell us updated hours value");
                                int newvalue4 = scan.nextInt();
                                array[index].setPrice(newvalue4);
                                System.out.println(array[index].getPrice() + " has updated");
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
        android_customer_details[] duplicate_array=new android_customer_details[array.length] ;
        for (int i=0;i<array.length;i++){
            duplicate_array[i]=array[i];
        }
        try {

            System.out.println("sorting option enabled");
            android_customer_details referance;
            for (int i = 0; i < duplicate_array.length; i++) {
                for (int j = i + 1; j < duplicate_array.length; j++) {
                    if (options.equalsIgnoreCase("name")) {
                        if (duplicate_array[j] != null) {
                            if (duplicate_array[i].getName().compareTo(duplicate_array[j].getName()) > 0) {
                                referance = duplicate_array[i];
                                duplicate_array[i] = duplicate_array[j];
                                duplicate_array[j] = referance;
                            }
                            else {
                                System.out.println("name sorting failed");
                            }
                        }

                    } else if (options.equalsIgnoreCase("ph_no")) {
                        if (duplicate_array[j] != null) {
                            if (duplicate_array[i].getPh_no() < duplicate_array[j].getPh_no()) {
                                referance = duplicate_array[i];
                                duplicate_array[i] = duplicate_array[j];
                                duplicate_array[j] = referance;
                            } else {
                                System.out.println("ph no sorting failed");
                            }
                        }
                    } else if (options.equalsIgnoreCase("mobile_brand")) {
                        if (duplicate_array[j] != null) {
                            if (duplicate_array[i].getMobile_brand().compareTo(duplicate_array[j].getMobile_brand()) > 0) {
                                referance = duplicate_array[i];
                                duplicate_array[i] = duplicate_array[j];
                                duplicate_array[j] = referance;
                            } else {
                                System.out.println("mobile  brand sorting failed");
                            }
                        }

                    } else if (options.equalsIgnoreCase("mobile_model")) {
                        if (duplicate_array[j] != null) {
                            if (duplicate_array[i].getMobile_model().compareTo(duplicate_array[j].getMobile_model()) > 0) {
                                referance = duplicate_array[i];
                                duplicate_array[i] = duplicate_array[j];
                                duplicate_array[j] = referance;
                            } else {
                                System.out.println("mobile model sorting failed");
                            }
                        }

                    } else if (options.equalsIgnoreCase("price")) {
                        if (duplicate_array[j] != null) {
                            if (duplicate_array[i].getPrice() > duplicate_array[j].getPrice()) {
                                referance = duplicate_array[i];
                                duplicate_array[i] = duplicate_array[j];
                                duplicate_array[j] = referance;
                            } else {
                                System.out.println("price sorting failed");
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
            int a = 1;
            for (android_customer_details print : duplicate_array) {
                System.out.println(print);
            }
    }
    @Override
    public void searching() {
        int ref = 0;
        for (int i=0;i<array.length;i++){
            if(array[i]!=null){
                ref+=1;
            }
        }
        System.out.println("which field you want to search");
        Scanner scann = new Scanner(System.in);
        String srch = scann.next();
            if (srch.equalsIgnoreCase("name")||srch.equalsIgnoreCase("mobile_brand")||srch.equalsIgnoreCase("mobile_model")) {
                String opt_1 = scann.next();
                for (int i = 0; i <ref; i++) {
                    if (array[i].getName().equalsIgnoreCase(opt_1) || array[i].getMobile_brand().equalsIgnoreCase(opt_1) || array[i].getMobile_model().equalsIgnoreCase(opt_1)) {
                        System.out.println(array[i]);
                    }
                }
            }
            else if (srch.equalsIgnoreCase("price")) {
                int opt_1 = scann.nextInt();
                for (int i = 0;i<ref;i++) {
                    if (array[i].getPrice() == opt_1 || array[i].getPh_no() == opt_1) {
                        System.out.println(array[i]);
                    }
                }
            }
            else if (srch.equalsIgnoreCase("ph_no")){
                long opt_1 = scann.nextLong();
                for (int i = 0;i<ref;i++) {
                if (array[i].getPrice()==opt_1||array[i].getPh_no()==opt_1) {
                    System.out.println(array[i]);
                }
            }
        }
    }

    @Override
    public void logs(String log_name) throws IOException, ClassNotFoundException {

    }


}

