import java.util.ArrayList;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> inputs = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Done")) {
                break;
            }
            inputs.add(input);
        }

        scanner.close();

        for (int i = inputs.size() - 1; i >= 0; i--) {
            System.out.println(inputs.get(i));
        }
    }
}















