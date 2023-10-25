import java.util.ArrayList;
import java.util.Scanner;

public class Clonearray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter names and enter exit if you want to break:");

        String input;
        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            list.add(input);
        }

        scanner.close();

        ArrayList<String> clonedList = new ArrayList<>(list);

        System.out.println("Original ArrayList: " + list);
        System.out.println("Cloned ArrayList: " + clonedList);
    }
}


