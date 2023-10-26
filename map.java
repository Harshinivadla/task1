import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class map {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> Map = new HashMap<>();

        System.out.println("Enter key-value pairs value and enter done to exit:");
        while (true) {
            System.out.print("Key: ");
            String key = scanner.nextLine();

            if (key.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Value: ");
            int value = scanner.nextInt();
            scanner.nextLine();
            Map.put(key, value);
        }

        Map<String, Integer> map1 = new HashMap<>();

        map1.putAll(Map);

        System.out.println("Final Map: " + map1);

        scanner.close();
    }
}
