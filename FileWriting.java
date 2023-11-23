import java.io.IOException;
import java.util.Scanner;
import java.io.FileOutputStream;

public class FileWriting {
    public static void main(String[] args) {
        FileOutputStream filew = null;
        try {

            filew = new FileOutputStream("FileWriting.txt");
            System.out.println("Enter input string : ");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            byte b[] = str.getBytes();
            filew.write(b);
            System.out.println(str);
            System.out.println("File Created Successfully.");
        } catch (IOException e) {
            System.out.println("Exception occured");
            e.getMessage();
        }
        finally{
            try {
                filew.close();
            } catch (Exception e) {
                System.out.println("Error!");
            }
        }
    }
}