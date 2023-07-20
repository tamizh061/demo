package mycodes.FundamentalJava.taskconsole;

public class main extends Thread {
    public static void main(String[] args) {
        execute obj=new execute();
        Thread th1=new Thread(obj,"tamil");
        th1.start();
    }
}
