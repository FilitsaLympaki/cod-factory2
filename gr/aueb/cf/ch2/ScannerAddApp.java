package gr.aueb.cf.ch2;

import java.util.Scanner;

public class ScannerAddApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        System.out.println("Please insert two integers");
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.printf("Το άθροισμα των %d και %d είναι ίσο με %d", num1, num2, sum);
    }
}
