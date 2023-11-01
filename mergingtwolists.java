import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mergingtwolists {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        System.out.print("Enter the number of elements for the first list: ");
        int n1 = input.nextInt();
        System.out.println("Enter elements for the first list:");
        for (int i = 0; i < n1; i++) {
            int element = input.nextInt();
            list1.add(element);
        }

        System.out.print("Enter the number of elements for the second list: ");
        int n2 = input.nextInt();
        System.out.println("Enter elements for the second list:");
        for (int i = 0; i < n2; i++) {
            int element = input.nextInt();
            list2.add(element);
        }

        List<Integer> mergedList = mergeLists(list1, list2);

        System.out.println("Merged List: " + mergedList);
    }

    public static <T> List<T> mergeLists(List<T> list1, List<T> list2) {
        List<T> mergedList = new ArrayList<>();

        mergedList.addAll(list1);

        mergedList.addAll(list2);

        return mergedList;
    }
}

