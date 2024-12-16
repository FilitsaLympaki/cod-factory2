package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * 5 = 5*1, 5*2. 5*3 ... 5*10
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int i = 1;

        System.out.println("enter a num");
        inputNum = scanner.nextInt();

         while (i <= 10){

//           System.out.println(inputNum + " * " + i + "= " + inputNum * i);
             System.out.printf("%d * %2d = %2d\n", inputNum, i, inputNum * i );
             i++;
         }
    }
}
