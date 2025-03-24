public class empbas {
    public static void main(String[] args){
        emp e1 = new emp();
        e1.setData("jitesh",19);
        e1.getData();
    }
}
class emp{
    String name;
    int age;
    public void setData(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void getData(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}