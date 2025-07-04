package Filehandling;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TaskFh1 {
    public static void main(String[] args) {
        File f1 = new File("FileName01.txt"); // Create new file
        FileOutputStream outfile = null;

        byte[] Text = {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'I', 'N', 'D', 'I', 'A'};

        try {
            outfile = new FileOutputStream(f1);
            outfile.write(Text);
        } catch (IOException e) {
            System.out.println(e);
            System.exit(-1);
        } finally {
            try {
                if (outfile != null)
                    outfile.close(); // Always close the stream
            } catch (IOException e) {
                System.out.println("Error closing file: " + e);
            }
        }

        System.out.println("Write Byte");
        System.out.println("Thank You...!!!");
    }
}
