package Exceptions.Day_5;

public class checkFinallyOnReturn {
    private static int Test() {
        try {
            return 1;
        } finally {
            System.out.println("finally runs");
        }
    }

    public static void main(String[] args) {
        Test();
    }
}