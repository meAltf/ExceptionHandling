package Exceptions.Day_1;

public class Example {

    public static void main(String[] args) {
        int a = 10, b = 0;
        int result = a / b; // ❌ This will throw ArithmeticException
        System.out.println(result);
    }
}
