package Exceptions.Day_3;

public class PracticeDay3 {
    public static void riskyMethod() throws ArithmeticException {
        throw new ArithmeticException("Deliberate error");
    }

    public static void main(String[] args) {
        try {
            riskyMethod();
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Caught in main: " + arithmeticException.getMessage());
        } finally {
            System.out.println("Cleaning up in finally...");
        }
    }
}
