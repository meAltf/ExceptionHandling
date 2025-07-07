package Exceptions.Day_1.CheckedException;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileExample {

    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("Nonexistent.txt");
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File not found!");
        }
    }
}
