// Try to create csv file
// Add FirstName, LastName and mobileNumber inside the csv file.


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class task34FileCSV {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

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

        try (FileWriter fileW = new FileWriter("C:filecsv.csv",true)){

            System.out.println("Enter how many contacts you want to add : ");
            int choice = input.nextInt();
            input.nextLine();

            for (int i=0;i<choice ; i++){
                System.out.println("Enter FirstName: ");
                String firstname = input.nextLine();

                System.out.println("Enter last name :");
                String lastname = input.nextLine();

                System.out.println("Enter mobile number :");
                long mobileNo = input.nextLong();
                input.nextLine();

                fileW.append(firstname)
                .append(",")
                .append(lastname)
                .append(",")
                .append(String.valueOf(mobileNo))
                .append("\n");
            }
        }catch(IOException e){
            e.printStackTrace();;
        }
    }
}



