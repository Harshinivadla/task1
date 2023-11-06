/*import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;*/

import java.util.*;

class Employee {
    private int empid;
    private String name;

    public Employee(int empid, String name) {
        this.empid = empid;
        this.name = name;
    }

    public void display() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + name);
    }
}

class PermanentEmployee extends Employee {
    public PermanentEmployee(int empid, String name) {
        super(empid, name);
    }

    public void display() {
        super.display();
    }
}

class ParttimeEmployee extends Employee {
    public ParttimeEmployee(int empid, String name) {
        super(empid, name);
    }

    public void display() {
        super.display();
    }
}

class ContracttypeEmployee extends Employee {
    public ContracttypeEmployee(int empid, String name) {
        super(empid, name);
    }

    public void display() {
        super.display();
    }
}

public class EmployeeManagementSystem {
    private Map<Integer, Employee> employees = new HashMap<>();

    public void addEmployee(Integer newemployeeid, Employee newemployee) {
        employees.put(newemployeeid, newemployee);
        System.out.println("Employee added to hash!");
    }

    public void modifyEmployee(int empid, Employee modifiedEmployee) {
        if (employees.containsKey(empid)) {
            employees.put(empid, modifiedEmployee);
            System.out.println("Employee with ID " + empid + " modified successfully.");
        } else {
            System.out.println("Employee with ID " + empid + " not found.");
        }
    }

    public void removeEmployee(int empid) {
        if (employees.containsKey(empid)) {
            employees.remove(empid);
            System.out.println("Employee with id " + empid + " deleted");
        } else {
            System.out.println("Employee with id " + empid + " not found");
        }
    }

    public Employee searchEmployee(int empid) {
        return employees.get(empid);
    }

    public void listEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees to list.");
        } else {
            for (Employee employee : employees.values()) {
                employee.display();
                System.out.println();
            }
        }
    }

    public static void main(String args[]) {
        EmployeeManagementSystem employeesystem = new EmployeeManagementSystem();
        Scanner inputScanner = new Scanner(System.in);

        while (true) {
            System.out.println("Employee Management System:");
            System.out.println("1. Add employee");
            System.out.println("2. Modify Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. List Employees");
            System.out.println("5. Search Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = inputScanner.nextInt();

            switch (choice) {
                case 1:
                System.out.print("Enter Employee ID: ");
                int empId = inputScanner.nextInt();
                inputScanner.nextLine();
                System.out.print("Enter Employee Name: ");
                String name = inputScanner.nextLine();
                System.out.println("Select Employee Type:");
                System.out.println("1. Permanent Employee");
                System.out.println("2. Part-Time Employee");
                System.out.println("3. Contract Employee");
                System.out.print("Enter the employee type: ");
                int empType = inputScanner.nextInt();
                Employee employee = null;


                if (empType == 1) {
                    employee = new PermanentEmployee(empId, name);
                } else if (empType == 2) {
                    employee = new ParttimeEmployee(empId, name);
                } else if (empType == 3) {
                    employee = new ContracttypeEmployee(empId, name);
                } else {
                    System.out.println("Invalid employee type.");
                }

                if (employee != null) {
                    employeesystem.addEmployee(empId, employee);
                }
                break;

            case 2:
                System.out.print("Enter Employee ID to modify: ");
                int empIdToModify = inputScanner.nextInt();
                inputScanner.nextLine();
                System.out.print("Enter Employee Name: ");
                String modifiedName = inputScanner.nextLine();
                System.out.println("Select Employee Type:");
                System.out.println("1. Permanent Employee");
                System.out.println("2. Part-Time Employee");
                System.out.println("3. Contract Employee");
                System.out.print("Enter the employee type: ");
                int modifiedEmpType = inputScanner.nextInt();
                Employee modifiedEmployee = null;


                if (modifiedEmpType == 1) {
                    modifiedEmployee = new PermanentEmployee(empIdToModify, modifiedName);
                } else if (modifiedEmpType == 2) {
                    modifiedEmployee = new ParttimeEmployee(empIdToModify, modifiedName);
                } else if (modifiedEmpType == 3) {
                    modifiedEmployee = new ContracttypeEmployee(empIdToModify, modifiedName);
                } else {
                    System.out.println("Invalid employee type.");
                }

                if (modifiedEmployee != null) {
                    employeesystem.modifyEmployee(empIdToModify, modifiedEmployee);
                }
                break;

            case 3:
                System.out.print("Enter Employee ID to remove: ");
                int empIdToremove = inputScanner.nextInt();
                employeesystem.removeEmployee(empIdToremove);
                break;

            case 4:
                System.out.println("\nList of Employees:");
                employeesystem.listEmployees();
                break;

            case 5:
                System.out.print("Enter Employee ID to search: ");
                int searchId = inputScanner.nextInt();
                Employee foundEmployee = employeesystem.searchEmployee(searchId);
                if (foundEmployee != null) {
                    System.out.println("Employee found:");
                    foundEmployee.display();
                } else {
                    System.out.println("Employee with ID " + searchId + " not found.");
                }
                break;


            case 6:
                System.out.println("Exiting Employee Management System");
                inputScanner.close();
                System.exit(0);
                break;

            default:
                System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
