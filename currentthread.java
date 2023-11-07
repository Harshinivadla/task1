public class currentthread {
    public static void main(String[] args) {
        //Thread currentThread = Thread.currentThread();
        //Thread currentThread2 = Thread.currentThread();

        /*System.out.println(Thread.currentThread().getName());
        System.out.println(currentThread.getId());
        System.out.println(currentThread.getState());
        System.out.println(currentThread.getPriority());
        currentThread.setPriority(Thread.MAX_PRIORITY);
        System.out.println(currentThread.getPriority());
        currentThread.setPriority(Thread.MIN_PRIORITY);
        System.out.println(currentThread.getPriority());

        currentThread.setName("Harshini");
        System.out.println(currentThread.getName());

        System.out.println(Thread.currentThread());*/

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getState());
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        System.out.println(Thread.currentThread().getPriority());

        Thread.currentThread().setName("Harshini");
        System.out.println(Thread.currentThread().getName());

        System.out.println(Thread.currentThread());

    }
}

