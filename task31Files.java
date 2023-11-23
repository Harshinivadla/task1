//Write a java program to get the input from the user and store it into file and display the file content. Using Reader and Writer file.

import java.util.*;
import java.io.*;
public class task31Files {
    public static void main(String[] args) throws IOException {
        FileWriter fileW = new FileWriter("C:UserinputWriteAndRead.txt");
        System.out.println("Enter input String :  ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        fileW.write(str);
        fileW.close();
        System.out.println("Successfully added the content to file..");


        Reader fileR = new FileReader("C:UserinputWriteAndRead.txt");
        Scanner dataReader = new Scanner(fileR);
        while (dataReader.hasNextLine()) {
            String fileData = dataReader.nextLine();
            System.out.println(fileData);
        }
        dataReader.close();
        fileR.close();
        System.out.println("Read successfully");


    }
}