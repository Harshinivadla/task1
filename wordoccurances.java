import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
class wordoccurances
{
    public static void main(String args[])
    {
        String input;
        Scanner stringinput=new Scanner(System.in);
        System.out.print("Enter the string :");
        input=stringinput.nextLine();
        System.out.println(input);
        String[] words = input.split(" ");
        HashMap<String, Integer> wordcount = new HashMap<>();
        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
            if (!word.isBlank()) {
                if (wordcount.containsKey(word)) {
                    wordcount.put(word, wordcount.get(word) + 1);
                } else {
                    wordcount.put(word, 1);
                }
            }

    }
    System.out.println(wordcount);
}
}