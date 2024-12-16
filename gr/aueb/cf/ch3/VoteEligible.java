package gr.aueb.cf.ch3;

import java.util.Scanner;

public class VoteEligible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputAge = 0;
        final int AGE = 18;
        boolean isEligible = false;

        System.out.println("Please enter your age");
        inputAge = scanner.nextInt();

        //isEligible
        isEligible = inputAge >= AGE;

        System.out.printf("Your age is %d, you are eligible for voting: %b", inputAge, isEligible);
    }
}
