// 1. 	canRead()  ---------Boolean The canRead() method is used to check whether we can read the data of the file or not.
// 2.	createNewFile()	----Boolean	The createNewFile() method is used to create a new empty file.
// 3.	canWrite()	--------Boolean	The canWrite() method is used to check whether we can write the data into the file or not.
// 4.	exists()	--------Boolean	The exists() method is used to check whether the specified file is present or not.
// 5.	delete()	--------Boolean	The delete() method is used to delete a file.
// 6.	getName()	--------String	The getName() method is used to find the file name.
// 7.	getAbsolutePath()---String	The getAbsolutePath() method is used to get the absolute pathname of the file.
// 8.	length()	--------Long	The length() method is used to get the size of the file in bytes.
// 9.	list()	String[]----The list() method is used to get an array of the files available in the directory.
// 10.	mkdir()	------------Boolean	The mkdir() method is used for creating a new directory.
// File Operations
// We can perform the following operation on a file:

// Create a File
// Get File Information
// Write to a File
// Read from a File
// Delete a File

import java.io.File;
import java.io.IOException;
class  Filehandlingpractise{
    public static void main(String args[]) {
        try{
            File file1 = new File("C:\\Users\\V HARSHINI\\OneDrive\\Desktop\\market simplified training java\\file1.txt");
            if(file1.createNewFile()){
                System.out.println("File created");
            }
            else{
                System.out.println("Already exist");
            }
        }catch(IOException e){
            System.out.println("Error occured!");
        }
    }
}
