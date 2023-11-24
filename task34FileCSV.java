import java.io.File;
import java.io.IOException;

public class task34FileCSV {
    public static void main(String[] args) {
        File filecsv = new File("C:filecsv.csv");
        try {
            if (filecsv.createNewFile()){
                System.out.println("CSV File created...");
            }
            else{
                System.out.println("Filealready exist...");
            }
        } catch (IOException e) {
            System.out.println("Error occured...");
            e.printStackTrace();
        }
    }
}
