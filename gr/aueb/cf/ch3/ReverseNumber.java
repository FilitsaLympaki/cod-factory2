package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * 123 = 321
 */
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int reversed = 0;
        int num = 0;
        System.out.println("Enter an integer");
        inputNum = scanner.nextInt();

        num = inputNum;
        while (num > 0){
            int remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num = num / 10;
            }
        System.out.println("The reverse number of " + inputNum + " is " + reversed);
    }
}
