// Create, delete employee, List employees Employees Search functionality, sort an employee by Id or Name(List and stream)

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;

class Employee{
    int emp_id;
    String emp_name;


    public Employee(int emp_id , String emp_name ){
        this.emp_id = emp_id;
        this.emp_name = emp_name;
    }

    public int getemp_id(){
        return emp_id;
    }

}
class StreamsEmployeeManagement {
    public static void main(String[] args) {
        List<Employee> Employee = new ArrayList<>();

        Scanner input = new Scanner(System.in);


        System.out.println("1. Add Employee");
        System.out.println("2. Delete Employee");
        System.out.println("3. Display Employee");
        System.out.println("4. Search Employee");
        System.out.println("5. Sort by ID");
        System.out.println("6. Exit");

        while(true){
        System.out.println("Enter your choice: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter Employee Id :");
                int emp_id = input.nextInt();
                input.nextLine();

                System.out.println("Enter Employee name :");
                String emp_name = input.nextLine();

                Employee.add(new Employee(emp_id , emp_name));
                break;


            case 2:
                System.out.println("Enter employee id to delete :");
                int Id = input.nextInt();

                Employee.removeIf(employee->employee.emp_id==Id);
                break;


            case 3:
                System.out.println("Display Employee details:");
                Employee.stream().forEach(r->System.out.println(r.emp_id+" "+r.emp_name));
                break;


            case 4:
                System.out.println("Searching employee by employee ID:");
                int searchId = input.nextInt();

                Employee.stream().filter(e->e.emp_id==searchId).forEach(r->System.out.println(r.emp_name));
                break;


            case 5:
                System.out.println("Sorting Employee List by Employee Id ..");

                Comparator<Employee> ComparingEmployee = Comparator.comparing(em->em.emp_id);
                Employee.stream().sorted(ComparingEmployee).forEach(r->System.out.println(r.emp_id+" "+r.emp_name));
                break;

            case 6:
                System.out.println("EXIT...");
                input.close();
                break;


            default:
                System.out.println("Invalid choice...");
                break;
        }
        }
    }

    private static Predicate<? super Employee> removeIf(boolean b) {
        return null;
    }
}
