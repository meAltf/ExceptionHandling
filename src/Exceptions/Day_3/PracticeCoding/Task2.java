package Exceptions.Day_3.PracticeCoding;

public class Task2 {

    private static void checkAge(int age){
        if(age < 18){
            throw new IllegalArgumentException("You must be atleast 18 year age!");
        }
        System.out.println("Welcome to robert duniaa..");
    }

    public static void main(String[] args) {
        checkAge(7);
    }
}
