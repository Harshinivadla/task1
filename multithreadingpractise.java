class thread1 extends Thread{
    int values[]={6,5,4,3,2};
    public void run(){
        for (int i=0;i<5;i++){
            values[i]=values[i]*2;
            System.out.println(i);
        }
    }
}

class hi extends Thread{
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("HI" + Thread.currentThread().getPriority());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}

//Syncronization concept

class count{
    int count;
    public synchronized void  increment(){
        count++;
    }
}

public class multithreadingpractise{
    public static void main(String args[]) throws InterruptedException{

//the capability to control the access of multiple threads to any shared resource. In the Multithreading concept, multiple threads try to access
// the shared resources at a time to produce inconsistent results. The synchronization is necessary for reliable communication between threads.

        counter c =new counter();

        Thread t5 = new Thread(()->
        {
            for ( int i=0;i<1000;i++){
                c.increment();
            }
        });

        Thread t6 = new Thread(()->
        {
            for ( int i=0;i<1000;i++){
                c.increment();
            }
        });

        t5.start();
        t6.start();

        t5.join();
        t6.join();

        System.out.println("count : "+c.count);

//synchronization end

        hi obj1 = new hi();
        thread1 obj7 = new thread1();
        obj7.start();

        //Runnable doesnot have start method so we need to add thread
        Runnable obj2 = new Runnable(){
            public void run(){
                for (int i=0;i<5;i++){
                    System.out.println("HELLO");

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {}
            }
        }
    };


    //LAMBDA FUNCTION
        Runnable obj3 = () ->
        {
            for (int i=0;i<5;i++){
                    System.out.println("harshini");

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.getMessage();
                    }
                }
        };
//WE CAN USE LAMBDA FUNCTION CODE DIRECTLY IN THREAD
        Thread t4 = new Thread(() ->
        {
            for (int i=0;i<5;i++){
                    System.out.println("vadla");

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {}
                }
            },"vadla thread");   // WE CAN DIRECTLY ADD THREAD NAME HERE IN LAMBDA FUNCTION
        t4.start();

        Thread t3 = new Thread(obj3);
        t3.start();

        Thread t2 = new Thread(obj2);
        t2.start();

        obj1.start();
        try {
            Thread.sleep(10);
        } catch (Exception e) {}

        //Checking the thread is alive or not
        System.out.println(t3.isAlive());
//we can add thread's name
        t2.setName("Harshu's thread1");
        System.out.println(t2.getName());
        System.out.println(t3.getName());
        System.out.println(t4.getName());


        //SETTING AND PRINTING PRIORITY
        System.out.println(t2.getPriority());
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t2.getPriority());
        t3.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t3.getPriority());
        t4.setPriority(Thread.NORM_PRIORITY);
        System.out.println(t4.getPriority());


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


// allows one thread to wait until another thread completes its execution
//bye will print last
        t2.join();
        t3.join();
        t4.join();

        //thread will not be alive after join
        System.out.println(t2.isAlive());
        System.out.println("BYE");
    }
}