package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

public class DateTimeToSeccondsConverter {
    public static void main(String[] args) {
        int days;
        int hours;
        int minutes;
        int seconds;
        int totalSeconds = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Please insert four integers");
        days = in.nextInt();
        hours = in.nextInt();
        minutes = in.nextInt();
        seconds = in.nextInt();

       final int totalDaysSeconds =  24 * 60 * 60;
        final int totalHoursSeconds = 3600;
        final int totalMinuteSecond = 60;
        totalSeconds = days *totalDaysSeconds + hours * totalHoursSeconds + minutes * totalMinuteSecond + seconds;
        System.out.printf(Locale.US, "Total seconds: %,d ", totalSeconds);
   }
}
