import java.lang.annotation.Target;

public class m1{
    public static void main(String [] args){
        Table t1 = new Table();
        th1 t2 = new th1(t1);
        th2 t3 = new th2(t1);
        t2.start();
        t3.start();
    }
}
class Table{
    synchronized void printTable(int n){
        for(int i=1;i<=5;i++){
            System.out.println(n + " x " + i + " = " + (n*i));
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
class th1 extends Thread{
    Table t;
    th1(Table t){
        this.t = t;
    }
    public void run(){
        t.printTable(5);
    }
}
class th2 extends Thread{
    Table t;
    th2(Table t){
        this.t = t;
    }
    public void run(){
        t.printTable(10);
    }
}