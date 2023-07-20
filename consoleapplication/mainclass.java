package mycodes.FundamentalJava.consoleapplication;


import java.io.IOException;

public class mainclass {
    public static void main(String[] args) throws IOException {
//         excution_all obj=new excution_all();
      // Collectionprocess obj =new Collectionprocess();
       fileimplementation obj =new fileimplementation();
        Thread th1=new Thread(obj);
    th1.start();
    }
}
