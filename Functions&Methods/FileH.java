
import java.io.*;

class FileH {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("file1.txt");
        fos.write("Hello Java".getBytes());
        fos.close();

        FileInputStream fis = new FileInputStream("file1.txt");
        int i;
        while ((i = fis.read()) != -1) {
            System.out.print((char)i);
        }
        fis.close();
    }
}