import java.io.*;
import java.util.*;
import java.util.stream.*;

public class task32 {
    public static void main(String[] args) {
        Scanner inputuser = new Scanner(System.in);

        System.out.println("Enter no. of numbers: ");
        int input = inputuser.nextInt();

        List<Integer> numberslist = new ArrayList<>();

        System.out.println("Enter numbers: ");
        for (int i = 0; i < input; i++) {
            int numbers = inputuser.nextInt();
            numberslist.add(numbers);
        }

        String fileName = "numbers.txt";
        try (FileWriter fileW = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileW)) {

            for (Integer number : numberslist) {
                bufferedWriter.write(number + " ");
            }

            System.out.println("Numbers written to file: " + fileName);



        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                FileWriter fileW = new FileWriter(fileName,true);
                fileW.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (FileReader fileR = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileR)) {

            String line = bufferedReader.readLine();
            List<Integer> numbersFromFile = Arrays.stream(line.split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            List<Integer> distinctOddCount = numbersFromFile.stream()
                    .filter(n -> n % 2 != 0)
                    .distinct()
                    .sorted()
                    .collect(Collectors.toList());

            System.out.println("Odd count: " + distinctOddCount);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                FileReader fileR = new FileReader(fileName);
                fileR.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
