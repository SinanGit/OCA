package HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class mapTask {
    public static void main(String[] args) {
        // create a map of zipcodes and Cities, at least 3 entries
        // get the keySet and iterate over it, print the map like below:
        // zipcode1 => city1
        // zipcode2 => city2

        // part 2: print all the keys of the map

        HashMap<Integer, String > zipAndCity = new HashMap<>();
        zipAndCity.put(30808, "Kayseri");
        zipAndCity.put(11805, "Konya");
        zipAndCity.put(3597, "Izmir");

        Set<Integer> integers = zipAndCity.keySet();

        for(Integer key: integers){
            String value = zipAndCity.get(key);
            System.out.println(key+ "==>" + value);
        }

    }
}
