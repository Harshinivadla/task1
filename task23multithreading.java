class MultiThread extends Thread {
    String[] message = { "Java is object-oriented, open source, easy to learn, high performance, and fast" };

    public void run() {
        if (Thread.currentThread().isAlive()){
            System.out.println(Thread.currentThread().getName()+" is alive");
        }
        String[] words = message[0].split("\\s+");

        for (String word : words) {
            System.out.println(Thread.currentThread().getName() + " " + word);
        }
        System.out.println(Thread.currentThread().getName() + " is dead.");
    }
}

public class task23multithreading {
    public static void main(String[] args) {

        MultiThread thread0 = new MultiThread();
        MultiThread thread1 = new MultiThread();

        thread0.start();
        thread1.start();
    }
}