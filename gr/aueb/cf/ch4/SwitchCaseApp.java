package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * demo of switch/case
 */
public class SwitchCaseApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("choose");
            System.out.println("1, one-player game");
            System.out.println("2, two-player game");
            System.out.println("3, team game");
            System.out.println("4, quit");

            choice = scanner.nextInt();
            if (choice < 1 || choice > 4){
                System.out.println(" choice must be 1-4");
                System.out.println("try again");
                continue;
            }

//            if(choice == 1){
//                System.out.println("one-player game started");
//            }else if(choice == 2){
//                System.out.println("two player game started");
//            } else if (choice ==3) {
//                System.out.println("team game started");
//            }else{
//                System.out.println("quitting");
//            }
            switch (choice){
                case 1:
                    System.out.println("one-player game started");
                    break;
                case 2:
                    System.out.println("two player game started");
                    break;
                case 3:
                    System.out.println("team game started");
                    break;
                case 4:
                    System.out.println("quitting");
                    break;

                default:
                    System.out.println("Errot in choice");
                    break;

            }

        }while(choice != 4);
    }
}
