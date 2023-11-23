//Write a java program to get the input from the user and store it into file and display the file content. Using Reader and Writer file.





import java.util.*;
import java.io.*;
public class task31Files {
    public static void main(String[] args) {
            FileWriter fileW = null;
            FileReader fileR = null;

        try {
            //Writing a file
            fileW = new FileWriter("C:UserinputWriteAndRead.txt");
            System.out.println("Enter input String :  ");
            Scanner input = new Scanner(System.in);
            String str = input.nextLine();
            fileW.write(str);

            System.out.println("Successfully added the content to file..");
            if (fileW != null) {
                    fileW.close();
                }

            //Reading a file
            fileR = new FileReader("C:UserinputWriteAndRead.txt");
            Scanner dataReader = new Scanner(fileR);
            while (dataReader.hasNextLine()) {
                String fileData = dataReader.nextLine();
                System.out.println(fileData);
            }
            dataReader.close();

            System.out.println("Read successfully");
        } catch (IOException e) {
            System.out.println("Error occured!!");
            e.getMessage();
        }
        finally{
            // fileW.close();
            // fileR.close();
            try {
                if (fileR != null) {
                    fileR.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing the file!!");
                e.getMessage();
            }

        }
    }
}




// import java.util.*;
// import java.io.*;
// public class task31Files {
//     public static void main(String[] args) throws IOException {
//         FileWriter fileW = new FileWriter("C:UserinputWriteAndRead.txt");
//         System.out.println("Enter input String :  ");
//         Scanner input = new Scanner(System.in);
//         String str = input.nextLine();
//         fileW.write(str);
//         fileW.close();
//         System.out.println("Successfully added the content to file..");


//         Reader fileR = new FileReader("C:UserinputWriteAndRead.txt");
//         Scanner dataReader = new Scanner(fileR);
//         while (dataReader.hasNextLine()) {
//             String fileData = dataReader.nextLine();
//             System.out.println(fileData);
//         }
//         dataReader.close();
//         fileR.close();
//         System.out.println("Read successfully");


//     }
// }




// import java.util.*;
// import java.io.*;

// public class task31Files {
//     public static void main(String[] args) {
//         FileWriter fileW = null;
//         FileReader fileR = null;

//         try {
//             // Writing a file
//             fileW = new FileWriter("C:\\User\\inputWriteAndRead.txt"); // Corrected path
//             System.out.println("Enter input String :  ");
//             Scanner input = new Scanner(System.in);
//             String str = input.nextLine();
//             fileW.write(str);

//             System.out.println("Successfully added the content to file..");

//             // Reading a file
//             fileR = new FileReader("C:\\User\\inputWriteAndRead.txt"); // Corrected path
//             Scanner dataReader = new Scanner(fileR);
//             while (dataReader.hasNextLine()) {
//                 String fileData = dataReader.nextLine();
//                 System.out.println(fileData);
//             }
//             System.out.println("Read successfully");
//         } catch (IOException e) {
//             System.out.println("Error occurred!!");
//             e.printStackTrace(); // Print the stack trace for better debugging
//         } finally {
//             try {
//                 if (fileW != null) {
//                     fileW.close();
//                 }
//                 if (fileR != null) {
//                     fileR.close();
//                 }
//             } catch (IOException e) {
//                 System.out.println("Error closing the file!!");
//                 e.printStackTrace();
//             }
//         }
//     }
// }
