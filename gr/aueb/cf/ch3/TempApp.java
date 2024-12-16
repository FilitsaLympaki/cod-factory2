package gr.aueb.cf.ch3;

import java.util.Scanner;


public class TempApp {

    /**
     * this is a test app
     * <ul>
     *     <li>test1</li>
     * </ul>
     **/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = 0; //yitdfiytfifty
        boolean isTempBelowZero;

        System.out.println("Please insert the current temp");
        temp = in.nextInt();


        isTempBelowZero = temp < 0;

        System.out.println("Temp is below zero: " + isTempBelowZero);



    }
}
