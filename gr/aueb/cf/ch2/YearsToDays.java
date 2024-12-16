package gr.aueb.cf.ch2;

import java.util.Scanner;

public class YearsToDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int DAYS_PER_YEAR = 365;
        int age = 0;
        int days = 0;

        System.out.println("insert your age");
        age = scanner.nextInt();
        days = age * DAYS_PER_YEAR;

        System.out.printf("%d years is %d days:", age, days);
    }
}
