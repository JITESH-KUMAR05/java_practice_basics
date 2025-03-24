public class Threadpriorities {
    public static void main(String[] args) {
        myThread t1 = new myThread();
        t1.start();
        System.out.println("t1 priority line no 5 " + t1.getPriority());
        t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getPriority());
        myThread t2 = new myThread();
        t2.start();
        System.out.println(t2.getPriority());
        t2.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t2.getPriority());
        System.out.println(t1.MIN_PRIORITY);
        System.out.println(t1.MAX_PRIORITY);
        System.out.println(t1.NORM_PRIORITY);
    }
}
class myThread extends Thread{
    public void run(){
        System.out.println("Thread is running....");
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getName());
    }
}