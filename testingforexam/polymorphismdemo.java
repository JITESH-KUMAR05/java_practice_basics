public class polymorphismdemo {
    public static void main(String [] args){
        Animal obj = new Animal();
        obj.sound();
        Animal obj2 = new dog();
        obj2.sound();
    }
}
class Animal{
    public void sound(){
        System.out.println("Animal");
    }
}
class dog extends Animal{
    public void sound(){
        System.out.println("dog");
    }
}