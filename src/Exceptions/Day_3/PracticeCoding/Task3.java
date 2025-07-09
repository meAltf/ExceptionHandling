package Exceptions.Day_3.PracticeCoding;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task3 {

    public static void readFile() throws IOException {
        FileReader fileReader = new FileReader("file.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        System.out.println(bufferedReader.readLine());
        bufferedReader.close();
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException ioException) {
            System.out.println("File couldn't be read..");
        }
    }
}
