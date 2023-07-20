package mycodes.FundamentalJava.Thread;

public class excutethread {
    public static void main(String[] args)
    {
        cls1 obj1=new cls1();
        obj1.start();
        cls2 obj2=new cls2();
        Thread obj3=new Thread(obj2);
        obj3.start();
    }
}
class cls1 extends Thread {
    public void run()
    {
        for (int i = 0; i < 10; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class cls2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("helo");
            try {
                Thread.sleep(3000);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
