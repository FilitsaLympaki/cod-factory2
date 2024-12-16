package gr.aueb.cf.ch3;
/**
 * 123 = 1 + 2 + 3
 */

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int sum = 0;
        int tempNum = 0;

        System.out.println("enter a positive integer");
        inputNum = scanner.nextInt();

        tempNum = inputNum;
        while(tempNum > 0){
            sum = sum + tempNum % 10;
            tempNum= tempNum / 10;
        };

        System.out.println("the sum of " + inputNum + " is: " + sum);
    }
}
