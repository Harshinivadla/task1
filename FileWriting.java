import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileOutputStream;

public class FileWriting {
    public static void main(String[] args) {

        try {

            FileOutputStream filew = new FileOutputStream("FileWriting.txt");
            System.out.println("Enter input string : ");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            byte b[] = str.getBytes();
            filew.write(b);
            filew.close();
            System.out.println(str);
            System.out.println("File Created Successfully.");
        } catch (IOException e) {
            System.out.println("Exception occured");
            e.getMessage();
        }
    }
}