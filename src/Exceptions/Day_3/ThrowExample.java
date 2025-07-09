package Exceptions.Day_3;

public class ThrowExample {

    // Throwing a Built-in exception
    public static void main(String[] args) {
        int age = -5;
        if (age < 0) {
            throw new IllegalArgumentException("Age can't be negative!");
        }
    }
}
