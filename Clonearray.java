import java.util.ArrayList;

public class Clonearray {
    public static void main(String[] args) {
        ArrayList<String> List = new ArrayList<>();
        List.add("Harshini");
        List.add("Gayathri");
        List.add("Gopal");

        ArrayList<String> clonedList = new ArrayList<>();
        clonedList.addAll(List);


        ArrayList<String> clonedList1 = new ArrayList<>(List);


        System.out.println("Original ArrayList: " + List);
        System.out.println("Cloned ArrayList (using addAll): " + clonedList);
        System.out.println("Cloned ArrayList (using new ArrayList constructor): " + clonedList1);
    }
}

