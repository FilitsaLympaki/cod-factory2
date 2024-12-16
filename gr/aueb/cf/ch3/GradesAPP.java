package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * user input total grades, number of lessons
 *
 * μεσος ορος
 * Αριστα αν >=9
 * Πολυ καλα αν >=7
 * Καλος αν >=5
 * Αποτυχια αν <5
 */
public class GradesAPP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;
        int coursesCount = 0;
        int average = 0;

        System.out.println("pease insert total marks");
        totalMarks = scanner.nextInt();

        if(totalMarks <= 0){
            System.out.println("total marks must not be zero");
            System.exit(1);
        }

        System.out.println("please insert courses count");
        coursesCount = scanner.nextInt();

        if(coursesCount<=0){
            System.out.println("courses count must not be negative or zero");
            System.exit(1);
        }
        average = totalMarks / coursesCount;

        if(average > 10){
            System.out.println("Error the average is not valid");
            System.exit(1);
        }

        if(average >= 9){
            System.out.println("excellent");
        } else if (average>=7) {
            System.out.println("very good");
        } else if (average>=5) {
            System.out.println("good");
        }else {
            System.out.println("failure");
        }

    }
}
