import java.io.*;

public class streamsdemo {
    public static void main(String[] args) throws IOException {
        // Writing to file
        FileOutputStream fos = new FileOutputStream("test.txt");
        fos.write("Hello, World!".getBytes());
        fos.close();

        // Reading from file
        FileInputStream fis = new FileInputStream("test.txt");
        int i;
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }
        fis.close();
    }
}
