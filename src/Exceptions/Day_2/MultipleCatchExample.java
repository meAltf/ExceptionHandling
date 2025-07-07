package Exceptions.Day_2;

public class MultipleCatchExample {

    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            arr[5] = 10;              // throw ArrayIndexOutOfBoundsException
            int result = 10 / 0;      // ArithmeticException (won't reach here)
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Arithmetic error: " + arithmeticException.getMessage());
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("Array index error: " + arrayIndexOutOfBoundsException.getMessage());
        } catch (Exception exception) {
            System.out.println("General exception: " + exception.getMessage());
        }
    }
}
