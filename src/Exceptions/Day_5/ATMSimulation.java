package Exceptions.Day_5;

// step 1 : create custom exceptions
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

public class ATMSimulation {

    private static int balance = 5000;

    // step 2 : use custom exceptions in another method
    private static void withdraw(int amount) throws InsufficientBalanceException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be greater than 0.");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance.");
        }

        balance -= amount;
        System.out.println("Withdrawn: ₹" + amount);
        System.out.println("Remaining balance: ₹" + balance);
    }

    public static void main(String[] args) throws InsufficientBalanceException, InvalidAmountException {
        try {
            withdraw(900);         // Try 0, 7000, and 3000
        } catch (InvalidAmountException | InsufficientBalanceException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using the ATM.");
        }
    }
}
