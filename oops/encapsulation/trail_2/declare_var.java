package mycodes.FundamentalJava.oops.encapsulation.trail_2;

import javax.xml.stream.Location;

public class declare_var {
    private String car_name;
    private int price;
    private String location;

    public String setcarname(String car_name){
       return this.car_name=car_name;
    }
    public String getcarname(){
        return car_name;
    }
    public int setprice(int price){
        return this.price=price;
    }
    public int getprice(){
        return price;
    }
    public String setlocation(String LOCATION){
        return location=LOCATION;
    }
    public String getLocation(){
        return location;
    }
}
