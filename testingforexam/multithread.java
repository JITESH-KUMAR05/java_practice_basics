public class multithread {
    public static void main(String[] args){
        addng a = new addng();
        a.start();
        number n = new number();
        n.start();
        table t = new table();
        Thread t1 = new Thread(t);
        t1.start();

    }
}
class addng extends Thread{
    public void run(){
        System.out.println("Thread is running...");
    }
}
class number extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }
    }
}
class table implements Runnable{
    int n=5;
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(n + " X " + i + " = " + (n*i));
        }
    }
}