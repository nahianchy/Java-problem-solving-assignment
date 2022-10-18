package if_else_loop;

import java.util.Scanner;
  // --Write a program to calculate GPA and find grade--
public class Calculate_Gpa_And_Find_Grade {
    public static void main(String[] args) {
        System.out.println("please enter the subject number");
        Scanner input = new Scanner(System.in);
        int numberOfSubject = input.nextInt();
        float total = 0;
        boolean flag = true;

        for (int i = 1; i <= numberOfSubject; i++) {
            System.out.println("please enter your  marks");
            Scanner scanner = new Scanner(System.in);
            float value = scanner.nextFloat();
            total += value;


            if (value >= 80) {
                System.out.println("Your Subject Grade is A+ " + "Your Subject Grade Is 5");
            } else if (value >= 60 && value < 80) {
                System.out.println("Your Subject Grade is A " + "Your Subject Grade Is 4");
            } else if (value >= 60 && value < 70) {
                System.out.println("Your Subject Grade is A- " + "Your Subject Grade Is 3.5");
            } else if (value >= 50 && value < 60) {
                System.out.println("Your Subject Grade is B " + "Your Subject Grade Is 3");
            } else if (value >= 40 && value < 50) {
                System.out.println("Your Subject Grade is C " + "Your Subject Grade Is 2");
            } else if (value >= 33 && value < 40) {
                System.out.println("Your Subject Grade is D " + "Your Subject Grade Is 1");
            } else {
                flag = false;
                System.out.println("Fail");
            }
        }
        float grade = total / numberOfSubject;

        if (flag == true) {

            if (grade >= 80) {
                System.out.println("Your  Grade is A+ ");
            } else if (grade >= 60 && grade < 80) {
                System.out.println("Your  Grade is A ");
            } else if (grade >= 60 && grade < 70) {
                System.out.println("Your  Grade is A- ");
            } else if (grade >= 50 && grade < 60) {
                System.out.println("Your  Grade is B ");
            } else if (grade >= 40 && grade < 50) {
                System.out.println("Your  Grade is C ");
            } else if (grade >= 33 && grade < 40) {
                System.out.println("Your  Grade is D ");
            }

        } else {
            System.out.println("Your GPA is 0 "+ "grade is Faill" );
        }


//        System.out.println("Your total marks is " + total);
    }
}
