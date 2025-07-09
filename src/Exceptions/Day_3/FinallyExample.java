package Exceptions.Day_3;

public class FinallyExample {

    public static void main(String[] args) {
        int num = 100;
        try {
            int result = num / 0;
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Caught Arithmetic exception");
        } finally {
            System.out.println("This block always run, regardless of whether an exception throw or not.");
        }

    }
}
