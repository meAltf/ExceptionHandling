package Exceptions.Day_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionExample {

    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"));
            String line = bufferedReader.readLine();
            System.out.println("Read: " + line);
            bufferedReader.close();
        } catch (IOException ioException) {
            System.out.println("An I/O error occurred: " + ioException.getMessage());
        }
    }
}
