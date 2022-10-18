package Function_Array;

import java.util.Scanner;

public class FindNotes {
    public static void main(String[] args) {
        int notes[] = {1000, 500, 100, 50, 20, 10, 5, 2, 1};
        int amount;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter an Amount : ");
        amount = scanner.nextInt();
        if (amount > 0) {
            for (int i = 0; i < notes.length; i++) {
                int numberOfNote = amount / notes[i];
                amount %= notes[i];
                if (numberOfNote != 0) {
                    System.out.println(notes[i] + " " + numberOfNote);
                }
            }
        } else {
            System.out.println("Invalid amount");
        }
    }
}
