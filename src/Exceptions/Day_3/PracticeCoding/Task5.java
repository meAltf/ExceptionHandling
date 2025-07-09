package Exceptions.Day_3.PracticeCoding;

public class Task5 {

    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            System.out.println(arr[2]); // ArrayIndexOutOfBoundsException
            int result = 106 / 0;         // ArithmeticException
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("ArrayIndexOutOfBoundException..");
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Arithmetic Exception..");
        } finally {
            System.out.println("Method has been completed..");
        }
    }
}
