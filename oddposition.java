import java.util.Scanner;

public class oddposition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("Elements at odd positions: ");
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println("Element at position " + (i + 1) + ": " + array[i]);
            }
        }
    }
}
