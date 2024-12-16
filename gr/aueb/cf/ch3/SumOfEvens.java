package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * 20, 2 + 4 + 6 ...+ 20
 */
public class SumOfEvens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        int i = 2;

        System.out.println("Enter a number");
        num = scanner.nextInt();

        while (i <= num){
            sum = sum + i; // sum += i
            i = i + 2; // i += 2
        }
        System.out.println("the sum up to " + num + " is: " + sum);
    }
}
