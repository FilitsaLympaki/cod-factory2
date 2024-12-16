package gr.aueb.cf.ch3;

import java.util.Scanner;

public class FirstDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;

        int num = 0;
        System.out.println("Enter a num");
        inputNum = scanner.nextInt();

        num = inputNum;
        while (num >= 10){
            num /= 10;

        }

        System.out.println("the first digit of " + inputNum + " is: " + num);
    }
}
