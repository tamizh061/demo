package mycodes.FundamentalJava.consoleapplication;

import java.io.IOException;

public interface performance {
    public String adddetails(android_customer_details details) throws IOException, ClassNotFoundException;
    public void listout_details();
    public String delete(String name) throws IOException, ClassNotFoundException;
    public  void update(String name) throws IOException, ClassNotFoundException;
    public void sorting(String options);
    public void  searching();
    public void logs(String log_name) throws IOException, ClassNotFoundException;

}
