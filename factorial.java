import java.util.Scanner;
class factorial{
    public static void main(String args[])
    {
        int number,i,fact=1;
        System.out.println("Enter a number");
        Scanner inp = new Scanner(System.in);
        number = inp.nextInt();
        for (i=1;i<=number;i++){
            fact = fact*i;
        }
        System.out.println("Factorial of number is "+fact);
        inp.close();
    }
}

