package javaBasic;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class DateAndTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();

        String res = DateAndTime.findDay(month, day, year);
        System.out.println(res);
    }
    private static String findDay(int month, int day, int year) {
        LocalDate localDate = LocalDate.of(year, month, day);
        String dayOftheDate = localDate.getDayOfWeek()
                .getDisplayName(TextStyle.FULL, Locale.US)
                .toUpperCase();
        return dayOftheDate;
    }
}
