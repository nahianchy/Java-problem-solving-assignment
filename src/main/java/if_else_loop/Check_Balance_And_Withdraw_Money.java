package if_else_loop;

import java.util.Scanner;

// Write a program to check balance and withdraw money from ATM booth using if else or switch case
public class Check_Balance_And_Withdraw_Money {
    public static void main(String[] args) {

        System.out.println("Please Enter The Option");
        System.out.println("Enter 1 for check the balance");
        System.out.println("Enter 2 for  Withdraw balance");

        Scanner scanner = new Scanner(System.in);

        int option = scanner.nextInt();

        double balance = 5000;
        double withdrawBalance;

        switch (option) {
            case 1:
                System.out.println("Your Balance Is " + balance);
                break;
            case 2:
                Scanner withdrawBalanceInput = new Scanner(System.in);
                withdrawBalance = withdrawBalanceInput.nextDouble();

                if (withdrawBalance > balance) {
                    System.out.println("Insufficient Balance");
                } else {
                    System.out.println("Your Withdraw Balance is " + withdrawBalance);
                }
                break;
            default:
                System.out.println("Choose the right option");
        }
    }
}
