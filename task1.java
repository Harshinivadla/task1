import java.util.Scanner;

public class task1
{
    public static void main(String[] args)
    {
        try (//int number=11;
        Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int number = scan.nextInt();
            if(number > 0)
            {
                System.out.println(number+"Positive number");
            }
            else if(number < 0)
            {
                System.out.println(number+"Negative number");
            }
            else
            {
                System.out.println(number+"Number is 0");
            }
        }
    }
}