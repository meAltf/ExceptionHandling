package Exceptions.Day_4;

import java.util.Scanner;

// step 1: create custom exception by extending runtimeException
class TooShortPasswordException extends Exception {
    public TooShortPasswordException(String message) {
        super(message);
    }
}

public class PassworkChecker {

    // step 2 : use custom exception in another method
    private static void checkPassword(String password) throws TooShortPasswordException {
        if (password.length() < 6) {
            throw new TooShortPasswordException("Password length should be equal or more than 6 characters!");
        }
        System.out.println("Password Accepted!!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter password: ");
        String password = sc.nextLine();
        try {
            checkPassword(password);
        } catch (TooShortPasswordException tooShortPasswordException) {
            System.out.println("Error: " + tooShortPasswordException.getMessage());
        } finally {
            System.out.println("Check Password operation completed.");
        }
    }
}
