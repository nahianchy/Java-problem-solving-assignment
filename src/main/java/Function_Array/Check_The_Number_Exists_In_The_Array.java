package Function_Array;

//Take input from a user and check if the number exists in the array
//        let the array is [1,3,5,7,2,4,6,8]
//        Input: 7
//        Output: Found in the position 3
//        Input: 9
//        Output: Found no element

import java.util.Scanner;

public class Check_The_Number_Exists_In_The_Array {
    public static void main(String[] args) {

        int array[] = {1, 3, 5, 7, 2, 4, 6, 8};
        System.out.println("please enter number to search from (1,3,5,7,2,4,6,8)");
        Scanner scanner = new Scanner(System.in);
        int location = 0;
        boolean flag = false;
        int userInput = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == userInput) {
                location = i;
                flag = true;
            }
        }
        if (flag) {
            System.out.println("position is at " + location);

        } else {
            System.out.println("No Element Found");

        }


    }
}
