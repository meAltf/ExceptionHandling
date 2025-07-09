package Exceptions.Day_3.PracticeCoding;

public class Task1 {

    private static void divide(int a, int b) {
        try {
            System.out.println("Result: " + a / b);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Error: Division by zero");
        } finally {
            System.out.println("Divide operation has been completed..");
        }
    }

    public static void main(String[] args) {
        divide(12, 0);
    }
}
