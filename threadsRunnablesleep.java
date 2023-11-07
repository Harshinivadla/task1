import java.util.*;

class A implements Runnable{
    public void run(){
        Scanner input = new Scanner(System.in);
        String firstname = input.nextLine();

        for (int i=0; i<5; i++){
            System.out.println(firstname);
            try {
            Thread.sleep(500);
            } catch (InterruptedException e) {
        }
        }
    }
}
class B implements Runnable{
    public void run(){
        Scanner input2 = new Scanner(System.in);
        String lastname = input2.nextLine();

        for (int i=0; i<5;i++){
            System.out.println(lastname);

            try {
            Thread.sleep(500);
            } catch (InterruptedException e) {
        }
        }
    }
}

public class threadsRunnablesleep{
    public static void main(String[] args) {
        Runnable object1= new A();
        Runnable object2=new B();

        Thread t1 = new Thread(object1);
        Thread t2 = new Thread(object2);

        t1.start();
        t2.start();
    }
}