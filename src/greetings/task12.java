import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctLoginId = "harika";
        String correctPwd = "12345867";

        int count = 0;
        String loginid;
        String pwd;

        /*
        while (true) {
            System.out.println("Enter your login ID:");
            loginid = sc.nextLine();

            System.out.println("Enter your password:");
            pwd = sc.nextLine();

            if (loginid.equals(correctLoginId) && pwd.equals(correctPwd)) {
                System.out.println("You have logged in for " + (++count) + " times");
            } else {
                System.out.println("Invalid login ID or password. Exiting...");
                break;
            }
        }
        */

        count = 0;

        do {
            System.out.println("Enter your login ID:");
            loginid = sc.nextLine();

            System.out.println("Enter your password:");
            pwd = sc.nextLine();

            if (loginid.equals(correctLoginId) && pwd.equals(correctPwd)) {
                System.out.println("You have logged in for " + (++count) + " times");
            } else {
                System.out.println("Invalid login ID or password. Exiting...");
                break;
            }
        } while (true);

        sc.close();
    }
}
