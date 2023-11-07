import java.util.Scanner;

public class arraysize {
    public static void main(String[] args) {
        Scanner inputsize = new Scanner(System.in);
        System.out.println("Enter the array size");
        try {
            int arraysize = getArraySize(inputsize);
        } catch (NegativeArraySizeException e) {
            System.out.println("Error: Array size can't be negative");
        }
    }

    public static int getArraySize(Scanner scanner) throws NegativeArraySizeException {
        int arraySize = scanner.nextInt();
        if (arraySize < 0) {
            throw new NegativeArraySizeException();
        }
        return arraySize;
    }
}
