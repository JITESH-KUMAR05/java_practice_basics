class acc{
    int amt = 1000;
    synchronized void withdraw(int amt) {
        System.out.println("Going for Withdaw..");
        if (this.amt < amt){
            System.out.println("banace insufficient...going for deposit...");
            try{
                wait();
            }catch (Exception e){
                System.out.println(e);
            }
        }
        this.amt-=amt;
        System.out.println("Withdraw completed...");
    }
    synchronized void deposit(int amt){
        System.out.println("Going for deposit...");
        this.amt+=amt;
        System.out.println("Deposit completed...");
        notify();
    }
}

public class interthreadcommune {
    public static void main(String[] args) {
        acc a1 = new acc();
        new Thread(){
            public void run(){
                a1.withdraw(5000);
            }
        }.start();
        new Thread(){
            public void run(){
                a1.deposit(10000);
            }
        }.start();

    }

}