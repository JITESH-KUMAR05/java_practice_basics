public class parampassing {
//    implement later
    public static void main(String[] args){
        swapper obj = new swapper(10,20);
        System.out.println("Before swapping...call by value");
        System.out.println("a is "+obj.a + " and b is " + obj.b);
        obj.swap();
        System.out.println("After swapping...call by value");
        System.out.println("a is "+obj.a + " and b is " + obj.b);
        System.out.println("Before swapping call by Reference");
        System.out.println("a is "+obj.a + " and b is " + obj.b);
        obj.swapr(obj);
        System.out.println("After swapping call by Reference");
        System.out.println("a is "+obj.a + " and b is " + obj.b);
    }
}
class swapper{
    int a,b;
    swapper(int a,int b){
        this.a = a;
        this.b = b;

    }
    void swap(){
        int temp=a;
        a=b;
        b=temp;
    }
    void swapr(swapper ref){
        int temp;
        temp = ref.a;
        ref.a = ref.b;
        ref.b = temp;
    }
}