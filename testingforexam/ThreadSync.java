class table{
    synchronized void printTable(int n){
        for(int i=1;i<=5;i++){
            System.out.println(n + " X " + i + " = " + n*i);
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
class myThread1 extends Thread{
    table t;
    public myThread1(table t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }
}
class myThread2 extends Thread{
    table t;
    public myThread2(table t){
        this.t=t;
    }
    public void run(){
        t.printTable(10);
    }
}
public class ThreadSync {
    public static void main(String args[]){
        table obj = new table();
        myThread1 t1 = new myThread1(obj);
        myThread2 t2 = new myThread2(obj);
        t1.start();
        t2.start();
    }
}