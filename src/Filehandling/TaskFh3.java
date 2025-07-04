import java.io.*;
import java.util.*;

public class TaskFh3 {
    public static void main(String args[]) {
        FileOutputStream outfile = null;

        Scanner sc = new Scanner(System.in); // Declare Scanner
        System.out.println("Enter a string to write to the file:");
        String s = sc.nextLine(); // Read input from user

        byte b1[] = s.getBytes();

        try {
            outfile = new FileOutputStream("FileName02.txt"); // Creates/overwrites the file
            outfile.write(b1); // Write bytes to file
            outfile.close(); // Close the file stream
        } catch(IOException e) {
            System.out.println(e);
            System.exit(-1);
        }

        System.out.println("Write Byte");
        System.out.println("Thank You...!!!");
    }
}
