   import java.io.*;

   public class Append {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("file.txt", true);
        fos.write("\nAppended Data".getBytes());
        fos.close();
    }
} 

