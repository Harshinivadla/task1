import java.util.Scanner;

class EvenFactorException extends Exception {
    public EvenFactorException(String message) {
        super(message);
    }
}

public class UserDefinedException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        try {
            checkoddexception(number);
        } catch (EvenFactorException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void checkoddexception(int number)throws EvenFactorException{
        if (!(number% 2 == 0)) {
                throw new EvenFactorException("odd number found");
            }
            else{
                System.out.println("Even number");
            }
    }
}
