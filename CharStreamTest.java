import java.io.*;
public class CharStreamTest {
    public static void main (String[] args) throws IOException{
        StringReader sr = new StringReader("Hi!");
        int x;
        while ((x = sr.read()) ! = -1) {
            System.out.println((char)x  + " ");
        }
    }
}