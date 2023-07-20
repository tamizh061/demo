package mycodes.FundamentalJava.Files.Secured;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;
public class read {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\tamiz\\IdeaProjects\\src\\main\\java\\mycodes\\FundamentalJava\\Files\\Secured\\siva.txt");
        FileInputStream fis = new FileInputStream(file);
        InflaterInputStream  iis=new InflaterInputStream(fis);
        byte[] by=new byte[fis.available()];
        iis.read(by);
        String st=new String(by);
        System.out.println(st);
        iis.close();
        fis.close();
    }
}
