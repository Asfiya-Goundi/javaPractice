import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFromAnotherFile {
        public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("source.txt");
        FileOutputStream fos = new FileOutputStream("dest.txt");

        int i;
        while ((i = fis.read()) != -1) {
            fos.write(i);
        }

        fis.close();
        fos.close();
    }
}

