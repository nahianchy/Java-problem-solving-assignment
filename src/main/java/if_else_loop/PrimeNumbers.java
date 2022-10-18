package if_else_loop;

import java.util.Scanner;

// -- Write a program to print prime numbers from 2 to n--
public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int remainder = 0;

        for (int j = 2; j <= n; j++) {
            int count = 0;
            //----first loop---
            for (int i = 1; i <= j; i++) {
                remainder = j % i;
                if (remainder == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("the number is prime " + j);
            }
            //----End first loop---

        }




    }
}
