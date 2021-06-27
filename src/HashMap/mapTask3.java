package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class mapTask3 {
    public static void main(String[] args) {

        // PART 1
        // create a map groups and members of group
        // "Group1" = ["Member1", "Member2"]
        // "Group2" = ["Member3", "Member4", "Member5"]

        // PART 2
        // count how many members each group has

        ArrayList<String> group1 = new ArrayList<>(Arrays.asList("Sinan", "Selda"));
        ArrayList<String> group2 = new ArrayList<>(Arrays.asList("Neda", "Ihsan"));

        HashMap<String, ArrayList<String>> groups = new HashMap<>();
        groups.put("Birinci", group1);
        groups.put("Ikinci", group2);
        System.out.println("Ailemiz " + groups);

        Set<String> keys = groups.keySet();
        for(String key : keys){
            ArrayList<String> strings = groups.get(key);
            System.out.println(strings.size());
        }


    }
}
