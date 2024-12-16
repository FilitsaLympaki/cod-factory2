package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        int sum = 0;
        int input = 0;
        int digit1 = 0;
        int digit2 =0;

        Scanner in = new Scanner(System.in);

        System.out.println("Please insert an integer");
        input = in.nextInt();
        digit1 = input / 10;
        digit2 = input % 10;
        sum = digit1 + digit2;

        System.out.printf("%d sum = %d + %d = %d ", input, digit1, digit2, sum);

    }
}
