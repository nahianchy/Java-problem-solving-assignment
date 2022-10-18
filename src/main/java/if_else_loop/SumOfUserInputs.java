package if_else_loop;

//Write a program to sum of user input until users input ‘q’ from keyboard

import java.util.Scanner;

public class SumOfUserInputs {
    public static void main(String[] args) {
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        char ch;
        while (true) {
            System.out.println("Input a number");
            int num=scanner.nextInt();
            sum+=num;
            System.out.println(sum);
            System.out.println("Do you want to continue Or press q for Quit the Program");
            ch = scanner.next().charAt(0);
            if(ch=='q'){
                break;
            }
        }
    }
}
