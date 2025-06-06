package greetings;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String loginid = "harika";
        String pwd = "12345867";
        int count = 0;

        while (true) {
            System.out.println("Enter your login ID:");
            String enteredId = sc.nextLine();

            System.out.println("Enter your password:");
            String enteredPwd = sc.nextLine();

            if (enteredId.equals(loginid) && enteredPwd.equals(pwd)) {
                System.out.println("You have logged in for " + (++count) + " times");
            } else {
                System.out.println("Invalid login ID or password. Exiting...");
                break;
            }
        }

        sc.close();
    }
}
