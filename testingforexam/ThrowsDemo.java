public class ThrowsDemo {
    public static void divide(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Divide by zero not allowed!");
        }else{
            System.out.println("Result is : " + (a/b));
        }
    }
    public static void main(String [] args){
        try{
            ThrowsDemo.divide(10,2);
            ThrowsDemo.divide(10,0);
        }catch (Exception e){
            System.out.println("Caught an exception: " + e.getMessage());
        }finally {
            System.out.println("Finally block");
        }
    }
}