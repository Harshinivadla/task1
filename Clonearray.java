import java.util.ArrayList;

public class Clonearray {
    public static void main(String[] args) {
        ArrayList<String> List = new ArrayList<>();
        List.add("Harshini");
        List.add("Gayathri");
        List.add("Gopal");

        ArrayList<String> clonedList = new ArrayList<>();
        clonedList.addAll(List);

        // Approach 2: Creating a new ArrayList and adding elements
        ArrayList<String> clonedList1 = new ArrayList<>(List);

        // Display the original and cloned ArrayLists
        System.out.println("Original ArrayList: " + List);
        System.out.println("Cloned ArrayList (using addAll): " + clonedList);
        System.out.println("Cloned ArrayList (using new ArrayList constructor): " + clonedList1);
    }
}

