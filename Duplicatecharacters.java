public class Duplicatecharacters {
    public static void main(String[] args) {
        String inputString = "Harshini Gayathri";
        Duplicatecharacters(inputString);
    }

    public static void Duplicatecharacters(String input) {
        input = input.replaceAll("\\s", "").toLowerCase();

        int[] charcount = new int[26];

        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                charcount[c - 'a']++;
            }
        }

        System.out.println("Duplicate characters in the string: ");
        for (int i = 0; i < charcount.length; i++) {
            if (charcount[i] > 1) {
                char duplicateChar = (char) ('a' + i);
                System.out.println(duplicateChar + " - " + charcount[i] + " times");
            }
        }
    }
}
