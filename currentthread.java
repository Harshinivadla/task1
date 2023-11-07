public class currentthread {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        Thread currentThread2 = Thread.currentThread();
        Thread currentThread3 = Thread.currentThread();

        System.out.println(currentThread.getName());
        System.out.println(currentThread.getId());
        System.out.println(currentThread.getState());
        System.out.println(currentThread.getPriority());
        currentThread.setPriority(Thread.MAX_PRIORITY);
        System.out.println(currentThread.getPriority());
        currentThread2.setPriority(Thread.MIN_PRIORITY);
        System.out.println(currentThread2.getPriority());

        currentThread.setName("Harshini");
        System.out.println(currentThread.getName());




    }
}

