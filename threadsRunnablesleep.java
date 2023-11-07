import java.util.*;

class thread1 extends Thread{
    public void run(){
        Scanner input = new Scanner(System.in);
        String firstname = input.nextLine();


        for (int i=0; i<5; i++){
            System.out.println(firstname);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class thread2 extends Thread{
    public void run(){
        Scanner input2 = new Scanner(System.in);
        String lastname = input2.nextLine();


        for (int i=0; i<5;i++){
            System.out.println(lastname);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



public class threadsRunnablesleep{
    public static void main(String[] args) {
        thread1 object1= new thread1();
        thread2 object2=new thread2();

        Thread t1 = new Thread(object1);
        Thread t2 = new Thread(object2);

        t1.start();
        t2.start();
    }
}