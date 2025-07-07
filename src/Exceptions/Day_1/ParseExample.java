package Exceptions.Day_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseExample {

    public static void main(String[] args) {
        String dateStr = "31-02-2025"; // Invalid date
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date date = simpleDateFormat.parse(dateStr); // May throw parseException
            System.out.println("Date: " + date);
        } catch (ParseException parseException) {
            System.out.println("Invalid date format or value!");
        }
    }
}
