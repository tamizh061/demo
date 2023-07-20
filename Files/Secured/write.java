package mycodes.FundamentalJava.Files.Secured;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

public class write {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\tamiz\\IdeaProjects\\src\\main\\java\\mycodes\\FundamentalJava\\Files\\Secured\\siva.txt");
       // file.createNewFile();
        FileOutputStream fos=new FileOutputStream(file);
        DeflaterOutputStream dos=new DeflaterOutputStream(fos);//encode the file datas
        Scanner scn=new Scanner(System.in);
        String content= scn.nextLine();
        dos.write(content.getBytes());
        dos.close();
        fos.close();

    }
}
