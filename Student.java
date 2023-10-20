import java.util.Scanner;

public class Student {
    String studId;
    String name;
    int age;
    double totalMarks;

    public void setdata(String studId, String name, int age, double totalMarks) {
        this.studId = studId;
        this.name = name;
        this.age = age;
        this.totalMarks = totalMarks;
    }

    public void displaydata() {
        System.out.println("Student ID: " + studId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Total Marks: " + totalMarks);
    }

    public static void main(String[] args) {
        Student stud = new Student();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the StudentId");
        String studId = input.next();
        input.nextLine();

        System.out.println("Enter the Student name");
        String name = input.nextLine();

        System.out.println("Enter the Student age");
        int age = input.nextInt();

        System.out.println("Enter the Student totalmarks");
        double totalMarks = input.nextDouble();

        stud.setdata(studId, name, age, totalMarks);
        stud.displaydata();
    }
}

