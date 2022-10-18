package if_else_loop;

public class SumOfNumbers {
    //    Write a program to sum of numbers which only divisible by 5 from 1 to 100
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            int div = i % 5;
            if (div == 0) {
                sum += i;
            }
        }
        System.out.println("sum of numbers is " + sum);

    }
}
