class Thread1 extends Thread {
    public void run() {
        System.out.println("Thread 1 is running");
    }
}

class Thread2 extends Thread {
    public void run() {
        System.out.println("Thread 2 is running");
    }
}

public class checkthreadrunornot {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        thread2.start();
        boolean isThread1Running = thread1.isAlive();
        boolean isThread2Running = thread2.isAlive();
        System.out.println("Thread 1 is running: " + isThread1Running);
        System.out.println("Thread 2 is running: " + isThread2Running);
    }
}
