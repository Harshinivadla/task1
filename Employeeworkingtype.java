import java.util.Scanner;

public class Employeeworkingtype {
    protected String name;

    public void workingtype() {
        System.out.println(name + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int type;

        System.out.println("Enter the Employee Name: ");
        name = sc.nextLine();

        System.out.println("Enter the Employee type: 1.Parttime 2.Fulltime 3.Contract");
        type = sc.nextInt();

        Employeeworkingtype employee = null;

        switch (type) {
            case 1:
                employee = new Parttime();
                break;
            case 2:
                employee = new Fulltime();
                break;
            case 3:
                employee = new Contract();
                break;
            default:
                System.out.println("Not an employee");
                return;
        }

        employee.name = name;
        employee.workingtype();
    }
}

class Parttime extends Employeeworkingtype {
    public void workingtype() {
        System.out.println(name + " is a Parttime worker");
    }
}

class Fulltime extends Employeeworkingtype {
    public void workingtype() {
        System.out.println(name + " is a Fulltime worker");
    }
}

class Contract extends Employeeworkingtype {
    public void workingtype() {
        System.out.println(name + " is a Contract type worker");
    }
}




