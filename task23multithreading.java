class multithreading extends Thread {
    public void run() {
        System.out.println("Java is object-oriented, open source, easy to learn, high performance, and fast.");
    }
}

public class task23multithreading {
    public static void main(String[] args) {
        multithreading thread1 = new multithreading();
        multithreading thread2 = new multithreading();

        thread1.start();
        thread2.start();
    }
}

