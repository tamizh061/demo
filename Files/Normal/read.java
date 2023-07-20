package mycodes.FundamentalJava.Files.Normal;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class read {
    public static void main(String[] args) throws IOException {
        //file calling process
        File file=new File("C:\\Users\\tamiz\\IdeaProjects\\src\\main\\java\\mycodes\\FundamentalJava\\Files\\Normal write read\\tamil.txt");
        //file read process must be use file inuputstream
        FileInputStream fis=new FileInputStream(file);
        //allready the file is a byetes but we don'ty know how many bytes ther in files so we use available method for get the file byete size
        byte[] by=new byte[fis.available()];
        //read the file then storing the by array its read only a bytes
        fis.read(by);
        //if we see the content file must be in a string  so i typecasting the byte array in to string
        String OUT=new String(by);
        System.out.println(OUT);
        fis.close();




    }
}
