package Exceptions.Day_1;

public class ClassNotFoundExample {

    public static void main(String[] args) {
        try {
            Class.forName("com.example.MyClass");
        } catch (ClassNotFoundException classNotFoundException) {
            System.out.println("Class not found!");
        }
    }
}
