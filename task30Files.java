//                   Write a java program to get the input from the user and store it into file. Using Reader and Writer file.

import java.io.*;
import java.util.*;

public class task30Files {
    public static void main(String[] args) {
        try {
            System.out.println("Enter text to add in file..");
            Scanner input = new Scanner(System.in);
            String text = input.nextLine();
            FileWriter fileW = new FileWriter("C:task30Files.txt");
            fileW.write(text);
            System.out.println("Successfully added the content to file..");
            fileW.close();



            Reader fileR = new FileReader("C:task30Files.txt");
            Scanner dataReader = new Scanner(fileR);
            while (dataReader.hasNextLine()) {
                String fileData = dataReader.nextLine();
                System.out.println(fileData);
            }
            fileR.close();

            System.out.println("Read successfully");

        } catch (Exception e) {
            System.out.println("Error occured!!");
        }
    }
}
