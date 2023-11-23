//                   Write a java program to get the input from the user and store it into file. Using Reader and Writer file.

import java.io.*;
import java.util.*;

public class task30Files {
    public static void main(String[] args) {
        FileWriter fileW = null;
        FileReader fileR = null;
        try {
            System.out.println("Enter text to add in file..");
            Scanner input = new Scanner(System.in);
            String text = input.nextLine();
            fileW = new FileWriter("C:task30Files.txt");
            fileW.write(text);
            System.out.println("Successfully added the content to file..");
            if (fileW!=null){
                fileW.close();
            }



            fileR = new FileReader("C:task30Files.txt");
            Scanner dataReader = new Scanner(fileR);
            while (dataReader.hasNextLine()) {
                String fileData = dataReader.nextLine();
                System.out.println(fileData);
            }
            System.out.println("Read successfully");

        } catch (Exception e) {
            System.out.println("Error occured!!");
        }
        finally{
            try{
                if (fileR!=null){
                    fileR.close();
                }
            }catch(IOException e){
                System.out.println("Error occured!!");
                e.getMessage();
            }
        }
    }
}
