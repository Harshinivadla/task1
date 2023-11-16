import java.util.*;
import java.util.stream.*;


class Student{
    int id;
    String firstname;
    double CGPA;

    public Student(int id , String firstname , double CGPA){
        this.id = id;
        this.firstname = firstname;
        this.CGPA = CGPA;
    }
    public double getCGPA(){
        return this.CGPA;
    }
    public String getfirstname() {
        return this.firstname;
    }
    public int getid(){
        return this.id;
    }
}

public class StudentInfo {
    public static void main(String[] args) {

        List<Student> SortStudent = new ArrayList<Student>();
        Scanner inputuser = new Scanner(System.in);

        System.out.println("Enter number of Students : ");
        int input = inputuser.nextInt();

        for(int i=0 ; i<input ; i++){
            System.out.print("Enter new student ID: ");
            int id = inputuser.nextInt();

            System.out.print("Enter new student firstname: ");
            String firstname = inputuser.next();

            System.out.print("Enter new student CGPA: ");
            double CGPA = inputuser.nextDouble();

            SortStudent.add(new Student(id, firstname, CGPA));
        }


        Comparator<Student> CompareCGPA = Comparator.comparing(Student::getCGPA).reversed();
        Comparator<Student> CompareByFirstName = Comparator.comparing(Student::getfirstname);
        Comparator<Student> ComparebyID = Comparator.comparing(Student::getid);

        Comparator<Student> ComparingStudent = CompareCGPA.thenComparing(CompareByFirstName);
        Comparator<Student> FinalComparingStudent = ComparingStudent.thenComparing(ComparebyID);
        SortStudent.stream().sorted(FinalComparingStudent).forEach(i -> System.out.println(i.firstname));
    }
}
