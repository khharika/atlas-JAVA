package ds;

import java.util.HashMap;
import java.util.Map;

public class DSTask13 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Anitha", 101);
        hm.put("Kavitha", 102);
        hm.put("Meera", 103);

        // Print values using get() method
        for (String key : hm.keySet()) {
            System.out.println(key + " " + hm.get(key));
        }
    }
}
