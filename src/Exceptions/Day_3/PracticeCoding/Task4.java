package Exceptions.Day_3.PracticeCoding;

public class Task4 {

    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
            int result = 106 / 0;         // ArithmeticException
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException exception) {
            System.out.println("ArrayIndexOutOfBoundException or ArithmeticException");
        } finally {
            System.out.println("Method has been completed..");
        }
    }
}
