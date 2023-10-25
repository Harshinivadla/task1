import java.util.List;

public class minmaxarray {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 8, 2, 11, 3, 6, 9);

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
    }
}
