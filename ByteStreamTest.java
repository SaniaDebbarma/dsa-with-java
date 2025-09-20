import java.io.*;
public class ByteStreamTest {
    public static void main (String[]args) throws IOException {
        byte[] data = {65,66,67};
        ByteArrayInputStream bits = new ByteArrayInputStream(data);
        int x;
        while ((x=bits.read()) ! = -1) {
            System.out.println((char)x + " ");
        }
    }
    
}
