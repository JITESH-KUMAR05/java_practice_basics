// Outer class
class Outer {
    private String message = "Hello from Outer class!";

    // Inner class (nested class)
    class Inner {
        void display() {
            System.out.println(message); // Accessing Outer class member
        }
    }
}

public class NestedClassExample {
    public static void main(String[] args) {
        // Creating an instance of Outer class
        Outer outerObj = new Outer();

        // Creating an instance of Inner class using the Outer class instance
        Outer.Inner innerobj = Outer.new Outer.Inner()

        // Calling method of Inner class
        innerObj.display();
    }
}
