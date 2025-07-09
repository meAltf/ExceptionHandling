package Exceptions.Day_3;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {

    public static void readFile() throws IOException {
        FileReader fileReader = new FileReader("filename.txt");
    }

    public static void main(String[] args) {
        try {
            readFile(); // must handle or declare
        } catch (IOException ioException) {
            System.out.println("File not found or couldn't be read");
        }
    }
}
