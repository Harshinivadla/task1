//Write a java program to remove duplicates and print the odd numbers in a list using stream filter method.
import java.util.*;
import java.util.stream.*;

public class distinctoddstream {
    public static void main(String[] args) {

        Scanner inputuser = new Scanner(System.in);

        System.out.println("Enter no.of numbers : ");
        int input = inputuser.nextInt();

        List<Integer> numberslist = new ArrayList<>();

        System.out.println("Enter numbers : ");
        for(int i =0;i<input ; i++){
            int numbers = inputuser.nextInt();

            numberslist.add(numbers);
        }

        List<Integer> distinctoddcount = numberslist.stream().filter(n->n%2!=0).distinct().sorted().collect(Collectors.toList());
        System.out.println("odd count : "+distinctoddcount);
    }
}
