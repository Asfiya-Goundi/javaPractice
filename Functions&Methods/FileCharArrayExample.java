 import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharArrayExample {
    public static void main(String[] args) {

        String fileName = "sample.txt";

        // 🔹 Data to write (char array)
        char[] data = {'H', 'e', 'l', 'l', 'o', ' ', 'J', 'a', 'v', 'a'};

        // 🔸 Writing to file
        try {
            FileWriter writer = new FileWriter(fileName);

            writer.write(data);   // writing char array
            writer.close();

            System.out.println("Data written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 🔸 Reading from file using char array
        try {
            FileReader reader = new FileReader(fileName);

            char[] buffer = new char[100]; // buffer array
            int charsRead = reader.read(buffer);

            System.out.println("Data read from file:");
            for (int i = 0; i < charsRead; i++) {
                System.out.print(buffer[i]);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

