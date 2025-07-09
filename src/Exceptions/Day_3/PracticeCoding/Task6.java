package Exceptions.Day_3.PracticeCoding;

public class Task6 {
    public static int testFinally() {
        try {
            return 1;
        } finally {
            System.out.println("In finally block");
        }
    }

    public static void main(String[] args) {
        int result = testFinally();
        System.out.println("Returned: " + result);
    }
}
