package BT3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateManipulator {
    private final SimpleDateFormat sdf = new SimpleDateFormat();

    public void checkLeapYearAndFirstDay() {
        Calendar calendar = new GregorianCalendar();
        int year = calendar.get(Calendar.YEAR);
        boolean isLeap = new GregorianCalendar().isLeapYear(year);
        System.out.println(STR."\nThe current year is \{year}.");
        System.out.println(STR."\{year}\{isLeap ? " is " : " is not "}a leap year.");

        calendar.set(Calendar.DAY_OF_YEAR, 1);
        System.out.println(STR."The first day of the year is a \{calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, java.util.Locale.US)}");
    }

    public void printCurrentDateFormats() {
        System.out.println("\nCurrent date formats:");
        Date date = new Date();
        sdf.applyPattern("dd/MM/yyyy");
        System.out.println(STR."dd/MM/yyyy: \{sdf.format(date)}.");
        sdf.applyPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(STR."dd-MM-yyyy HH:mm:ss: \{sdf.format(date)}.");
        sdf.applyPattern("E, MMM dd yyyy");
        System.out.println(STR."E, MMM dd yyyy: \{sdf.format(date)}.");
    }

    public void checkDayOfWeek() {
        System.out.println("\nCheck the day of the week:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (dd/MM/yyyy): ");
        String inputDate = scanner.nextLine();
        try {
            sdf.applyPattern("dd/MM/yyyy");
            Date date = sdf.parse(inputDate);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            System.out.println(STR."The day of the week is \{calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, java.util.Locale.US)}.");
        } catch (Exception e) {
            System.out.println("Invalid date format.");
        }
    }

    public void getFirstAndLastDayOfMonth() {
        System.out.println("\nGet the first and last day of the month:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (dd/MM/yyyy): ");
        String inputDate = scanner.nextLine();
        try {
            sdf.applyPattern("dd/MM/yyyy");
            Date date = sdf.parse(inputDate);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
            System.out.println(STR."First day of the month: \{sdf.format(calendar.getTime())}.");
            calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
            System.out.println(STR."Last day of the month: \{sdf.format(calendar.getTime())}.");
        } catch (Exception e) {
            System.out.println("Invalid date format.");
        }
    }
}