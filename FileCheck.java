import java.io.*;
public class FileCheck {
    public static void main (String[]args) throws IOException{
        File f = new File("demo.txt");
        System.out.println(f.exists()? "Exists" : "Does not exist" );
        f.createNewFile();
        System.out.println(f.exists() ? "Exists" : "Does not exist");
    }
}
