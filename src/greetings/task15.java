package greetings;

public class task15 {

    public static void main(String[] args) {
        String str1 = "Java Strings ";              // String literal
        String str2 = new String(str1);             // New string object copied from str1
        String str3 = new String("are easy to learn ");  // Another new string
        char ch[] = {'S', 't', 'r', 'i', 'n', 'g'};
        String str4 = new String(ch);               // Create string from char array

        System.out.println(str1 + "\n" + str2 + "\n" + str3 + "\n" + str4);
    }
}

