package Exceptions.Day_1;

public class NullExample {
    public static void main(String[] args) {
        String name = null;
        System.out.println(name.length()); // ❌ NullPointerException | UnCheckedException
    }
}