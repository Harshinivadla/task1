import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class comparinghashset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> set1 = new HashSet<>();
        System.out.println("Enter elements for the first set and enter done to exit:");
        while (true) {
            System.out.print("Element: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            set1.add(input);
        }

        Set<String> set2 = new HashSet<>();
        System.out.println("Enter elements for the second set and enter done to exit:");
        while (true) {
            System.out.print("Element: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            set2.add(input);
        }

        Set<String> commonelements = new HashSet<>(set1);
        commonelements.retainAll(set2);

        System.out.println("Common Elements in both sets: " + commonelements);

        scanner.close();
    }
}
