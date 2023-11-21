import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public static void main(String[] args) {
        try {
            FileWriter filew = new FileWriter("C:FileWriting.txt");
            filew.write("Hi This is a writer file....");
            filew.close();
            System.out.println("Successfully added the content to file..");
        } catch (IOException e) {
            System.out.println("Error occured!!");
            e.printStackTrace();
        }
    }
}
