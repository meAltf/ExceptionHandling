package Exceptions.Day_1;

public class InterruptedExample {

    public static void main(String[] args) {
        try {
            System.out.println("Sleeping for 2 seconds...");
            Thread.sleep(2000); // May it will throw interruptedException
            System.out.println("Awake now.");
        } catch (InterruptedException interruptedException) {
            System.out.println("Thread was interrupted.");
        }
    }
}
