import java.io.*;
public class filedemo {
    public static void main(String args[]){
        try{
            File f1 = new File("filedemo.txt");
            String st = "This is a testing file which contails some text.\nhere we make some great texts so that you dan enjoy";
            FileWriter fw = new FileWriter(f1);
            fw.write(st);
            fw.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}