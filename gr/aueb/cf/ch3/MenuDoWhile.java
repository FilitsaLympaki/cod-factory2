package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * show a menu at least once
 */
public class MenuDoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        do{
            System.out.println("select");
            System.out.println("1. Insert");
            System.out.println("2. Insert");
            System.out.println("3. Insert");
            choice = in.nextInt();
        }while(choice != 3);
    }
}
