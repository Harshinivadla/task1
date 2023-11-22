//Write a java program to create a directory and file.

//If directory or file already exist, it should ask for confirmation to proceed. If user proceed with yes, then
//file/directory should be override otherwise it should be ignored.


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreatingDirectoryAndFile {
    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Users\\V HARSHINI\\OneDrive\\Desktop\\market simplified training java\\Creating Directory and File.txt");

        if (file1.exists()) {
            Scanner confirmation = new Scanner(System.in);
            System.out.println("File already exists. Do you want to override it? (YES or NO): ");
            String confirm = confirmation.nextLine().toUpperCase();

            if (confirm.equals("YES")) {
                if (file1.delete()) {
                    if (file1.createNewFile()) {
                        System.out.println("File overridden successfully.");
                    } else {
                        System.out.println("Failed to create file.");
                    }
                } else {
                    System.out.println("Failed to delete existing file.");
                }
            } else {
                System.out.println("File remains the same.");
            }

            confirmation.close();
        } else {
            if (file1.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("Failed to create file.");
            }
        }
    }
}


