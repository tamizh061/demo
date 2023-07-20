package mycodes.FundamentalJava.ArrayFolder.arraytasks;

public class task_02 {
    int[] array=new int[5];
    int global_var = 10;
    public void method() {

        for(int index=0;index<5;index++){
            array[index]=global_var+1;
            System.out.println(array[index]);
            global_var+=1;
        }

    }

    public static void main(String[] args) {
        task_02 obj = new task_02();
        obj.method();

    }
}
