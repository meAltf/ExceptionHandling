package Exceptions.Day_1.UnCheckedException;

public class TryCatchExample {

    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException exception) {
            System.out.println("You can't divide by zero.");
        }
    }
}
