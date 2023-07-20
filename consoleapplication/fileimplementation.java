package mycodes.FundamentalJava.consoleapplication;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class fileimplementation implements performance,Runnable {
    File added = new File("C:\\Users\\tamiz\\IdeaProjects\\src\\main\\java\\mycodes\\FundamentalJava\\consoleapplication\\logs\\added.txt");
    File deleted = new File("C:\\Users\\tamiz\\IdeaProjects\\src\\main\\java\\mycodes\\FundamentalJava\\consoleapplication\\logs\\deleted.txt");
    File updated = new File("C:\\Users\\tamiz\\IdeaProjects\\src\\main\\java\\mycodes\\FundamentalJava\\consoleapplication\\logs\\updated.txt");
    ArrayList<android_customer_details> arr = new ArrayList<android_customer_details>();
    ArrayList<android_customer_details> addedd = null;
    ArrayList<android_customer_details> deletedd = null;
    ArrayList<android_customer_details> updatedd = null;

    public fileimplementation() throws IOException {
        addedd = new ArrayList<android_customer_details>();
        deletedd = new ArrayList<android_customer_details>();
        updatedd = new ArrayList<android_customer_details>();
    }

    public void writing(String log_name,int y) throws IOException {
        FileOutputStream fos = new FileOutputStream(log_name);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        if (y == 1) {
            oos.writeObject(addedd);
            oos.close();
            fos.close();
        }
        else if (y == 2) {
            oos.writeObject(deletedd);
            oos.close();
            fos.close();
        }
        else if (y == 3) {
            oos.writeObject(updatedd );
            oos.close();
            fos.close();
        }
        else {
        }
    }
    public void reading(String log_name, int h) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream(log_name);
        ObjectInputStream ois = new ObjectInputStream(fis);
        if (h == 1) {
            addedd = (ArrayList<android_customer_details>) ois.readObject();
            ois.close();
            fis.close();
        }
        else if (h == 2) {
            deletedd = (ArrayList<android_customer_details>) ois.readObject();
            ois.close();
            fis.close();
        }
        else if (h == 3) {
            updatedd = (ArrayList<android_customer_details>) ois.readObject();
            ois.close();
            fis.close();
        } else {
        }
    }
    synchronized public void run() {
        Collectionprocess obj = new Collectionprocess(); //create object to current class
        do {
            System.out.println("press 1 to add_details\npress 2 to list details\npress 3 deelete option\n press 4 update details\npress 5 sorting details\npress 6 to search \npress 7 for see logs");
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
                case 7:
                    System.out.println("logs");
                    System.out.println("press 1 for see added details\n press2 for see deleted details\n press 3 for see updated details");
                    int usagee = scan.nextInt();
                    if (usagee == 1) {
                        try {
                            obj.logs("added");
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        } catch (ClassNotFoundException e) {
                            throw new RuntimeException(e);
                        }
                    } else if (usagee == 2) {
                        try {
                            obj.logs("deleted");
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        } catch (ClassNotFoundException e) {
                            throw new RuntimeException(e);
                        }
                    } else if (usagee == 3) {
                        try {
                            obj.logs("updates");
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        } catch (ClassNotFoundException e) {
                            throw new RuntimeException(e);
                        }
                    }

            }
        }
        while (true);
    }

    @Override
    public String adddetails(android_customer_details details) throws IOException, ClassNotFoundException {
        reading("added", 1);
        arr.add(details);
        addedd.add(details);
        writing("added",1);
        return details.getName() + " has been added succesfully";
    }
    @Override
    public void listout_details() {
        Iterator<android_customer_details> it = arr.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    @Override
    public String delete(String name) throws IOException, ClassNotFoundException {
        reading("deleted", 2);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getName().equalsIgnoreCase(name)) {
                System.out.println(arr.get(i).getName() + "has been deleted successfully");
                deletedd.add(arr.get(i));
                arr.remove(i);
                writing("deleted",1);
                break;
            }
        }
        return name + "has been deleted successfully";
    }

    @Override
    public void update(String namee) throws IOException, ClassNotFoundException {
        reading("updated", 3);
        Scanner scan = new Scanner(System.in);
        try {
            for (int index = 0; index < arr.size(); index++) {
                if (arr.get(index) != null) {
                    if (arr.get(index).getName().equalsIgnoreCase(namee)) {
                        System.out.println(arr.get(index));
                        System.out.println("which field data you want update");
                        String usage = scan.next();
                        FileOutputStream fos = new FileOutputStream(updated);
                        ObjectOutputStream oos = new ObjectOutputStream(fos);
                        switch (usage) {
                            case "name":
                                System.out.println("your are choosen  name \n please tell us new value you are replaced");
                                String newvalue = scan.next();
                                oos.writeObject("Before name is" + arr.get(index) + "has been changed in ...");
                                arr.get(index).setName(newvalue);
                                oos.writeObject("After name " + arr.get(index));
                                fos.close();
                                oos.close();
                                System.out.println(arr.get(index).getName() + "has been updated succesfully");
                                break;
                            case "mobilebrand":
                                System.out.println("you choosen mobilebrand value\n please tell us updated hours value");
                                String newvalue1 = scan.next();
                                oos.writeObject("Before mobilebrand is" + arr.get(index) + "has been changed in ...");
                                arr.get(index).setMobile_brand(newvalue1);
                                oos.writeObject("After mobilebrand " + arr.get(index));
                                fos.close();
                                oos.close();
                                System.out.println(arr.get(index).getMobile_brand() + " has updated");
                                break;
                            case "ph.no":
                                System.out.println("you choosen ph.no value\n please tell us updated hours value");
                                Long newvalue2 = scan.nextLong();
                                oos.writeObject("Before ph_no is" + arr.get(index) + "has been changed in ...");
                                arr.get(index).setPh_no(newvalue2);
                                oos.writeObject("After ph_no " + arr.get(index));
                                fos.close();
                                oos.close();
                                System.out.println(arr.get(index).getMobile_brand() + " has updated");
                                break;
                            case "mobile model":
                                System.out.println("you choosen mobile model value\n please tell us updated hours value");
                                String newvalue3 = scan.next();
                                oos.writeObject("Before mobile model is" + arr.get(index) + "has been changed in ...");
                                arr.get(index).setMobile_model(newvalue3);
                                oos.writeObject("After mobil model " + arr.get(index));
                                fos.close();
                                oos.close();
                                System.out.println(arr.get(index).getMobile_model() + " has updated");
                                break;
                            case "price":
                                System.out.println("you choosen price value\n please tell us updated hours value");
                                int newvalue4 = scan.nextInt();
                                oos.writeObject("Before price is" + arr.get(index) + "has been changed in ...");
                                arr.get(index).setPrice(newvalue4);
                                oos.writeObject("After price " + arr.get(index));
                                fos.close();
                                oos.close();
                                System.out.println(arr.get(index).getPrice() + " has updated");
                                break;
                        }

                    }
                } else {
                    continue;
                }
            }

        } catch (NullPointerException NE) {
            System.out.println("invalid input");
            listout_details();
            System.out.println("please enter a valid input");
            namee = scan.next();
            update(namee);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void sorting(String options) {
        ArrayList<android_customer_details> dublicatte_arr = new ArrayList<android_customer_details>();
        dublicatte_arr.addAll(arr);
        try {

            System.out.println("sorting option enabled");
            android_customer_details referance;
            for (int i = 0; i < dublicatte_arr.size(); i++) {
                for (int j = i + 1; j < dublicatte_arr.size(); j++) {
                    if (options.equalsIgnoreCase("name")) {
                        if (dublicatte_arr.get(j) != null) {
                            if (dublicatte_arr.get(i).getName().compareTo(dublicatte_arr.get(j).getName()) > 0) {
                                referance = dublicatte_arr.get(i);
                                dublicatte_arr.set(i, dublicatte_arr.get(j));
                                dublicatte_arr.set(j, referance);
                            } else {

                            }
                        }

                    } else if (options.equalsIgnoreCase("ph_no")) {
                        if (dublicatte_arr.get(j) != null) {
                            if (dublicatte_arr.get(i).getPh_no() > (dublicatte_arr.get(j).getPh_no())) {
                                referance = dublicatte_arr.get(i);
                                dublicatte_arr.set(i, dublicatte_arr.get(j));
                                dublicatte_arr.set(j, referance);
                            } else {
                                System.out.println("ph no sorting failed");
                            }
                        }
                    } else if (options.equalsIgnoreCase("mobile_brand")) {
                        if (dublicatte_arr.get(i).getMobile_brand().compareTo(dublicatte_arr.get(j).getMobile_model()) > 0) {
                            referance = dublicatte_arr.get(i);
                            dublicatte_arr.set(i, dublicatte_arr.get(j));
                            dublicatte_arr.set(j, referance);
                        } else {

                        }
                    } else if (options.equalsIgnoreCase("mobile_model")) {
                        if (dublicatte_arr.get(i).getMobile_model().compareTo(dublicatte_arr.get(j).getMobile_model()) > 0) {
                            referance = dublicatte_arr.get(i);
                            dublicatte_arr.set(i, dublicatte_arr.get(j));
                            dublicatte_arr.set(j, referance);
                        } else {

                        }
                    } else if (options.equalsIgnoreCase("price")) {
                        if (dublicatte_arr.get(j) != null) {
                            if (dublicatte_arr.get(i).getPrice() > (dublicatte_arr.get(j).getPrice())) {
                                referance = dublicatte_arr.get(i);
                                dublicatte_arr.set(i, dublicatte_arr.get(j));
                                dublicatte_arr.set(j, referance);
                            } else {

                            }
                        } else {
                            System.out.println("sorting failed");
                        }
                    }
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //listing the dublicate array
        Iterator it = dublicatte_arr.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    @Override
    public void searching() {
        int ref = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) != null) {
                ref += 1;
            }
        }
        System.out.println("which field you want to search");
        Scanner scann = new Scanner(System.in);
        String srch = scann.next();
        System.out.println("please enter " + srch + " details");
        if (srch.equalsIgnoreCase("name") || srch.equalsIgnoreCase("mobile_brand") || srch.equalsIgnoreCase("mobile_model")) {
            String opt_1 = scann.next();
            for (int i = 0; i < ref; i++) {
                if (arr.get(i).getName().equalsIgnoreCase(opt_1) || arr.get(i).getMobile_brand().equalsIgnoreCase(opt_1) || arr.get(i).getMobile_model().equalsIgnoreCase(opt_1)) {
                    System.out.println(arr.get(i));
                }
            }
        } else if (srch.equalsIgnoreCase("price")) {
            int opt_1 = scann.nextInt();
            for (int i = 0; i < ref; i++) {
                if (arr.get(i).getPrice() == opt_1 || arr.get(i).getPh_no() == opt_1) {
                    System.out.println(arr.get(i));
                }
            }
        } else if (srch.equalsIgnoreCase("ph_no")) {
            long opt_1 = scann.nextLong();
            for (int i = 0; i < ref; i++) {
                if (arr.get(i).getPrice() == opt_1 || arr.get(i).getPh_no() == opt_1) {
                    System.out.println(arr.get(i));
                }
            }
        }
    }

    @Override
    public void logs(String log_name) throws IOException, ClassNotFoundException {
        Scanner scan = new Scanner(System.in);
        FileInputStream fis = new FileInputStream(log_name);
        ObjectInputStream ois = new ObjectInputStream(fis);
        if (log_name.equalsIgnoreCase("added")) {
            reading("added",1);
        } else if (log_name.equalsIgnoreCase("deleted")) {
            reading("deleted", 2);
        } else if (log_name.equalsIgnoreCase("updated")) {
            reading("updated", 3);
        }
        else {
            System.out.println("fail");
        }
    }
}

