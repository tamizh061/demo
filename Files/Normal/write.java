package mycodes.FundamentalJava.Files.Normal;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class write {
    public static void main(String[] args) throws IOException, InterruptedException {
        //create a file process
        File file=new File("C:\\Users\\tamiz\\IdeaProjects\\src\\main\\java\\mycodes\\FundamentalJava\\Files\\tamil.txt");
        //FILe storing process must be use file outputstream
        FileOutputStream fos=new FileOutputStream(file);
        Scanner scan=new Scanner(System.in);
        String content=scan.nextLine();
        //in file storing process file  must be  in bytes data type so we use get bytes of the file
        fos.write(content.getBytes());
        System.out.println("file written succesfully");
        fos.close();

//        Runtime run= Runtime.getRuntime();
//        Process pro;
//        pro=run.exec("C:\\Users\\tamiz\\IdeaProjects\\src\\main\\java\\mycodes\\FundamentalJava\\Files\\tamil.txt");
//        Thread.sleep(1000);
    }
}
