package gr.aueb.cf.ch2;

import java.util.Scanner;

public class PriceWithVat {
    public static void main(String[] args) {
        double inputPrice;
        final double VAT = 0.24;
        double finalPrice;
        System.out.println("insert price");

        Scanner in = new Scanner(System.in);
        inputPrice = in.nextDouble();
        finalPrice = inputPrice + (VAT * inputPrice);
        System.out.printf("The final price is %.2f", finalPrice);
    }
}
