package Exceptions.Day_2;

public class CombinedExceptionExample {

    public static void main(String[] args) {
        System.out.println("Example of combined exceptions-:");
        try {
            int[] arr = new int[2];
            arr[3] = 99;
            int num = 10 / 0;
            System.out.println("null khoj rhe hai.." + arr[5]);
        } catch (ArithmeticException | IndexOutOfBoundsException | NullPointerException exception) {
            System.out.println("Caught an arithmetic, indexBoundException or null error.");
        }
    }
}
