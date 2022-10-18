package if_else_loop;

// Write a program to check if inputted letter is small or capital

import java.util.Scanner;

public class Check_Letter_Small_Or_Capital {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char c = input.next().charAt(0);

        if(c >= 'A' && c<= 'Z' ){
            System.out.println("Letter is Capital");
        }else if(c >= 'a' && c<= 'z'){
            System.out.println("Letter is Small");
        }
        else{
            System.out.println("Invalid Format");
        }
    }
}
