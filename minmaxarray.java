import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class minmaxarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter a integer value and enter 'done' to finish:");
        String input;

        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                numbers.add(number);
            }catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }
        }

        if (numbers.isEmpty()) {
            System.out.println("No numbers entered.");
            return;
        }

        int min = numbers.get(0);
        int max = numbers.get(0);

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        System.out.println("List: " + numbers);
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);

        scanner.close();
    }
}

