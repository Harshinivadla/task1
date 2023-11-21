import java.io.File;
import java.io.IOException;

public class CreatingDirectoryAndFile {
    public static void main(String args[]) {
        try{
            File file1 = new File("C:\\Users\\V HARSHINI\\OneDrive\\Desktop\\market simplified training java\\Creating Directory and File.txt");
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
