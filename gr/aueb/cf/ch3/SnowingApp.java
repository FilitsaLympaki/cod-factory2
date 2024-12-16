package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * snowing: raining AND temp<0
 */
public class SnowingApp {
    public static void main(String[] args) {
        boolean isRaining = false;
        boolean isSnowing = false;

        Scanner in = new Scanner(System.in);
        int temp = 0;

        System.out.println("please insert if it is raining");
        isRaining = in.nextBoolean();

        System.out.println("please insert a temp");
        temp = in.nextInt();

        isSnowing = temp<0 && isRaining;

        System.out.println("is snowing: " + isSnowing);
    }
}
