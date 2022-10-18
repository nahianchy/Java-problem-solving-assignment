package if_else_loop;

import java.util.Scanner;

public class FindFactorial {
    //    Write  a program to find the factorial of a given number
    public static void main(String[] args) {

        System.out.println("please enter the number");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int total = 1;

        for (int i = 1; i <= num; i++) {
            total *= i;
        }
        System.out.println("the factorial is " + total);

    }
}
