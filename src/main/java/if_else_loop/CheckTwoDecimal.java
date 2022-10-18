package if_else_loop;

import java.util.Scanner;

public class CheckTwoDecimal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first floatinpoint number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second floatinpoint number: ");
        double num2 = input.nextDouble();
        input.close();

        if (Math.abs(num1 - num2) <= 0.01) {
            System.out.println("These numbers are the same.");
        }
        else {
            System.out.println("These numbers are different.");
        }
    }
}
