public class Student {
    String studId;
    String name;
    int age;
    double totalMarks;

    public void setdata(String studId, String name, int age, double totalMarks) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the StudentId");
        studId = input.nextInt();
        System.out.println("Enter the Student name");
        name = input.nextLine();
        System.out.println("Enter the Student age");
        age = input.nextInt();
        System.out.println("Enter the Student total marks");
        totalMarks = input.nextFloat();
    }

    public void displaydata() {
        System.out.println("Student ID: " + studId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Total Marks: " + totalMarks);
    }

    public static void main(String[] args) {
        Student stud = new Student();
        stud.setdata();
        stud.displaydata();
    }
}
