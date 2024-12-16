package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * υπολογίζει το α^b
 */
public class PowerCalculator {
    public static void main(String[] args) {
        int base = 0;
        int power = 0;
        int i = 1;
        int result = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a base and a power");
        base = scanner.nextInt();
        power = scanner.nextInt();

        while (i <= power){
            result *= base; // result = result + base
            i++;

            System.out.println("result: " + result);
        }
    }
}
