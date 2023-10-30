import java.util.Scanner;

public class arraysize {
    public static void main(String[] args) {
        Scanner inputsize = new Scanner(System.in);
        System.out.println("Enter the array size");
        try {
            int arraysize = inputsize.nextInt();
            if (arraysize < 0) {
                throw new NegativeArraySizeException();

            }
        }
        catch (NegativeArraySizeException e) {
            System.out.println("Error: Array size cann't be negative");

        }
    }

}

