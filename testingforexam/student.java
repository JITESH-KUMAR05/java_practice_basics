public class student{
    static int total_Stu = 0;
    String name;
    float marks;
    student(String name,float marks){
        this.name=name;
        this.marks=marks;
        total_Stu++;
    }
    void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Marks: " + this.marks);
    }
    public static void main(String args[]){
        student s1 = new student("jitesh",20);
        student s2 = new student("kamal",21);
        s1.display();
        s2.display();
        System.out.println("Total Students: " + student.total_Stu);
    }
}