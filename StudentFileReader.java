import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StudentFileReader {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("student.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            System.out.println("📄 Contents of student.txt:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("❌ student.txt not found. Please make sure the file exists.");
        } catch (IOException e) {
            System.out.println("❌ An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
