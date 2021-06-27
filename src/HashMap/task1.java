package HashMap;

import java.util.HashMap;

public class task1 {
    public static void main(String args[]) {
        HashMap<String, Integer> hash_map = new HashMap<String, Integer>();
        hash_map.put("Red", 1);
        hash_map.put("Green", 2);
        hash_map.put("Black", 3);
        hash_map.put("White", 4);
        hash_map.put("Blue", 5);

        System.out.println(hash_map.isEmpty());
        hash_map.put("Purple", 6);

        System.out.println(hash_map);
        System.out.println(hash_map.containsKey("Blue"));
    }
}
