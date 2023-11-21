import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public static void main(String[] args) throws IOException {
            FileWriter filew = new FileWriter("C:FileWriting.txt");
            filew.write("Hi This is a writer file....");
            System.out.println("Successfully added the content to file..");
            filew.close();
    }
}
