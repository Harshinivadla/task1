class Thread1 extends Thread {
    String name;

    public Thread1(String name){
        this.name=name;
        start();
    }

    public void run() {
        System.out.println("Thread 1 is running");
    }
}

class Thread2 extends Thread {

    String name;

    public Thread2(String name){
        this.name=name;
        start();
    }

    public void run() {
        System.out.println("Thread 2 is running");
    }
}

public class checkthreadrunornot {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1("Thread1");
        Thread2 thread2 = new Thread2("Thread2");
        System.out.println("Thread 1 is running: " + thread1.isAlive());
        System.out.println("Thread 2 is running: " + thread2.isAlive());
    }
}
