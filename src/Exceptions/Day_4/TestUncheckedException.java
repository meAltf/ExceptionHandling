package Exceptions.Day_4;

import java.util.Scanner;

// step 1 : create custom exception | Extended by RuntimeException -> UncheckedException
class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class TestUncheckedException {

    private static void withdrawAmount(int balance) throws InsufficientBalanceException {
        if (balance < 100000) {
            throw new InsufficientBalanceException("You bitch don't have enough balance to stay in OYO hotel..");
        }
        System.out.println("Hey, Amount has been withdrawn!, go fuck..");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide amount to proceed further: ");
        int bankBalance = sc.nextInt();

        /**
         - No try-catch required, if runtime crash, if exception caught

         try {
         withdrawAmount(bankBalance);
         } catch (InsufficientBalanceException insufficientBalanceException) {
         System.out.println("Exception caught: " + insufficientBalanceException.getMessage());
         }
         **/

        withdrawAmount(bankBalance);
    }
}
