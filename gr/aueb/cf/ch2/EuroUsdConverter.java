package gr.aueb.cf.ch2;

import java.util.Scanner;

public class EuroUsdConverter {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int euro = 0;
//        int cents = euro * 99;
//        int dollars = (cents / 100) + (cents % 100);
//        System.out.println("Please insert an integer");
//        euro = in.nextInt();
//        System.out.printf("Η τιμή των %d ευρώ σε dollars είναι %d dollars", euro, dollars);

        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY =99;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert an integer");
        inputEuros = in.nextInt();
        totalUsaCents = inputEuros *  PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        System.out.printf("%d \u20AC = %d \u0024, %d cents", inputEuros, usaDollars, usaCents);
    }
}
