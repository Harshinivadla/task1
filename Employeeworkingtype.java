import java.util.Scanner;

public class Employeeworkingtype {

    public void workingtype() {
        System.out.println("Employee ");
    }

    public static void main(String[] args) {
        Employeeworkingtype typee = new Employeeworkingtype();
        typee.workingtype();
        Scanner sc = new Scanner(System.in);
        String name;
        int type;

        System.out.println(" Enter the Employee Name: ");
        name = sc.nextLine();

        System.out.println("Enter the Employee type: 1.Parttime 2.Fulltime 3.Contract");
        type = sc.nextInt();

        switch (type) {
            case 1:
                Employeeworkingtype type1 = new Parttime();
                type1.workingtype();
                break;
            case 2:
                Employeeworkingtype type2 = new Fulltime();
                type2.workingtype();
                break;
            case 3:
                Employeeworkingtype type3 = new Contract();
                type3.workingtype();
            default:
                System.out.println("Not an employee");
                break;
        }

    }
}

class Parttime extends Employeeworkingtype {
    public void workingtype() {
        System.out.println( " Employee is a Parttime worker");

    }
}

class Fulltime extends Employeeworkingtype {
    public void workingtype() {
        System.out.println( " Employee is a Fulltime worker");

    }

}

class Contract extends Employeeworkingtype {
    public void workingtype() {
        System.out.println( " Employee is a Contract type worker");

    }

}