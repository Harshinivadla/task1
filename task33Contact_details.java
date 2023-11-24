// 1. AddContact
// 2. UpdateContact
// 3. DeleteContact
// 4. GetContact
// 5. ListContact

// ContactInfo format will be [firstName,lastName,mobileNo,email].
//Use Hash for storing a values.

import java.io.*;
import java.util.*;


class Contact{
    String firstname;
    String lastname;
    double mobileNo;
    String email;

    public Contact(String firstname , String lastname , double mobileNo , String email){
        this.firstname = firstname;
        this.lastname = lastname;
        this.mobileNo = mobileNo;
        this.email = email;
    }
}

public class task33Contact_details{
    private static PrintWriter writer;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ArrayList<Contact> contacts = readContactsFromList();
        Set<Contact> contacts = readContactsFromHashSet();


        while(true){

            System.out.println("1. Add Contact");
            System.out.println("2. Update Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Search Contact");
            System.out.println("5. List Contact");
            System.out.println("6.Exit");

            System.out.println("Enter your choice : ");
            int choice = input.nextInt();

            switch(choice){
                case 1:
                    addContact(input , contacts);
                    break;

                case 2:
                    updateContact(input , contacts);
                    break;

                case 3:
                    deleteContact(input , contacts);
                    break;

                case 4:
                    searchContact(input , contacts);
                    break;

                case 5:
                    ListContact(contacts);
                    break;

                case 0:
                    writeContactsToHashSet(contacts);
                    System.out.println("Existing...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice...");

            }
        }
    }


    private static void addContact(Scanner input, Set<Contact> contacts) {
        System.out.println("Enter FirstName : ");
        String firstname = input.nextLine();

        input.nextLine();
        System.out.println("Enter LastName : ");
        String lastname = input.nextLine();
        System.out.println("Enter MobileNo : ");
        double mobileNo = input.nextDouble();
        input.nextLine();
        System.out.println("Enter email : ");
        String email = input.nextLine();

        contacts.add(new Contact(firstname, lastname, mobileNo, email));

        writeContactsToHashSet(contacts);
        System.out.println("Added new Contact successfully..");
    }

    private static void updateContact(Scanner input, Set<Contact> contacts) {
        System.out.println("Enter mobileNo to update : ");
        double mobileNoToUpdate = input.nextDouble();
        input.nextLine();

        for (Contact contact: contacts){
            if (contact.mobileNo == mobileNoToUpdate){
                System.out.println("Enter new FirstName :");
                String newfirstname = input.nextLine();
                contact.firstname = newfirstname;
                input.nextLine();
                System.out.println("Enter new LastName : ");
                String newlastname = input.nextLine();
                contact.lastname = newlastname;
                System.out.println("Enter new MobileNo : ");
                double newMobileNo = input.nextDouble();
                contact.mobileNo = newMobileNo;
                input.nextLine();
                System.out.println("Enter new emailid : ");
                String newEmailID = input.nextLine();
                input.nextLine();
                contact.email = newEmailID;

                System.out.println("Contacts updated successfully...");
                writeContactsToHashSet(contacts);
                return;
            }
        }
        System.out.println("Contact now found..");
    }

    private static void deleteContact(Scanner input, Set<Contact> contacts) {
        System.out.println("Enter mobileNo to delete :");
        double mobileNoToDelete = input.nextDouble();

        contacts.removeIf(contact -> contact.mobileNo == mobileNoToDelete);
        System.out.println("Contact deleted successfully..");
    }

    private static void searchContact(Scanner input, Set<Contact> contacts) {
        System.out.println("Enter mobileNo to get : ");
        double mobileNoToSearch = input.nextDouble();

        for(Contact contact : contacts){
            if(contact.mobileNo == mobileNoToSearch){
                System.out.println("Contact found: " + contact.firstname + " " + contact.lastname +
                ", MobileNo: " + contact.mobileNo + ", Email: " + contact.email);
                return;
            }
        }
        System.out.println("Contact not found...");
    }

    private static void ListContact(Set<Contact> contacts) {
        if (contacts!=null){
            for(Contact contact:contacts){
                System.out.println("FirstName: " + contact.firstname + ", LastName: " + contact.lastname +
                ", MobileNo: " + contact.mobileNo + ", Email: " + contact.email);
            }
        }
        else{
            System.out.println("Is empty..");
        }
    }

    public static String filename = "FileContactdetails.txt";
    private static void writeContactsToHashSet(Set<Contact> contacts) {
        // String filename = "FileContactdetails.txt";
        try(PrintWriter file =new PrintWriter(new FileWriter(filename))){
            for (Contact contact : contacts){
                file.println(contact.firstname + "," + contact.lastname + "," + contact.mobileNo + "," + contact.email);
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try {
                FileWriter fileW = new FileWriter(filename,true);
                fileW.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static Set<Contact> readContactsFromHashSet() {
        Set<Contact> contacts = new HashSet<>();
        //String filename = "FileContactdetails.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String data;
            while ((data = reader.readLine()) != null) {
                String[] details = data.split(",");
                if (details.length == 4) {
                    String firstname = details[0];
                    String lastname = details[1];
                    double mobileNo = Double.parseDouble(details[2]);
                    String email = details[3];
                    contacts.add(new Contact(firstname, lastname, mobileNo, email));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            try{
                FileReader fileR = new FileReader(filename);
                fileR.close();
            }catch(IOException e){
                e.printStackTrace();
            }

        }
        return contacts;
    }
}