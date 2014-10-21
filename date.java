/**
 * Date Validation
 * HW 3, part 1
 * CSC 211 602
 * @JustinWhite
 */

import java.util.*;

public class date {
    public static void main(String [] args) {
        int month, day, year;
        int totalDays = 1;
        boolean checkDay, checkMonth, checkYear, leapYear;
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter a date in the format of mm dd yyyy, seperated by spaces:");
        month = input.nextInt();
        day = input.nextInt();
        year = input.nextInt();
        
        leapYear = ((year % 4) == 0); //Checks if year is divisible by 4 evenly (a leap year) 
        
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
          totalDays = 31; //Months with 31 days
        else
        if (month == 4 || month == 6 || month == 9 || month == 11)
          totalDays = 30; //Months with 30 days
        else
        if (month == 2 && leapYear) 
          totalDays = 29; //If month is feburary and it is a leap year, we have 29 days.
        else
        if (month == 2)
          totalDays = 28; //If it is not a leapyear, and the month is feburary we have 28 days.
        
        checkMonth = (month >= 1 && month <= 12); //Validates month
        checkYear = (year > 10 && year < 2200);   //Validates year
        checkDay = (day > 0 && day <= totalDays); //Validates day is between 1 and total days in given month
        
        if ((checkDay == true) && (checkMonth == true) && (checkYear == true))
          System.out.println("You have a valid date.");
        else
          System.out.println("Your date is invalid.");
    }
}