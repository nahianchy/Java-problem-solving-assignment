package if_else_loop;

import java.util.Scanner;

// Write a program to enter the numbers till the user wants and at the end,
// the program should display the largest and smallest numbers user entered.
public class FindLargestAndSmallestNumber {
    public static void main(String[] args) {
        int number ;
        int input;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how  many numbers do you want to input :  ");
        number = scanner.nextInt();
        System.out.println("Enter "+number+" Numbers");
        for (int i = 0; i < number; i++) {
            input = scanner.nextInt();
            if(input>largest){
                largest = input;

            }
            if(input<smallest) {
                smallest = input;
            }
        }
        System.out.println(largest+" is the largest number");
        System.out.println(smallest+" is the smallest number");

    }
}
