package Exceptions.Day_4;

// step 1 : create a custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message); // providing a constructor that accepts an error message
    }
}

public class TestCheckedException {

    // step 2 : use in another class
    private static void checkAge(int age) throws InvalidAgeException {
        try {
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or greater than this..");
            }
        } finally {
            System.out.println("Age consideration method has been completed!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(9);
        } catch (InvalidAgeException invalidAgeException) {
            System.out.println("Caught Exception: " + invalidAgeException.getMessage());
        }
    }
}
