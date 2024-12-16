package gr.aueb.cf.ch3;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int abs = 0;
        System.out.println("Enter a num");
        num = scanner.nextInt();

//        if(num>=0) abs = num;
//        else abs = -num;

        //Ternary operator
        abs = (num>=0) ? num : -num;
        System.out.println("abs: " + abs);
    }
}
