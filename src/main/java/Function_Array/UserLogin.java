package Function_Array;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 3;
        String USERNAME = "admin";
        String PASSWORD = "admin@123";
        String userName="";
        String password = "";
        do {
            System.out.println("Please Enter Username");
            userName= scanner.next();
            System.out.println("Please Enter Password");
            password = scanner.next();
            if(userName.equals(USERNAME) && password.equals(PASSWORD)){
                System.out.println("Congratulations! you've Logged in to the System");
                break;
            }
            attempts--;
        }while (attempts>0);
        if(attempts==0){
            System.out.println("Your user has been temporary locked");
        }
    }
}
