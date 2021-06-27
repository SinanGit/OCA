package HashMap;

import java.util.*;

public class LongTask {
    public static void main(String[] args) {

        HashMap<Integer, String> cities = new HashMap<>();
        cities.put(501, "Holtsville");
        cities.put(6390, "Fishers Island");
        cities.put(10001, "New York");
        cities.put(10305, "Staten Island");
        cities.put(10451, "Bronx");
        cities.put(10501, "Amawalk");
        cities.put(10502, "Ardsley");
        cities.put(10504, "Armonk");
        cities.put(10505, "Baldwin Place");
        cities.put(10506, "Bedford");

        for (Map.Entry<Integer, String> city : cities.entrySet()) {
            System.out.println("Postcode: " + city.getKey() + " ==> " + "City: " + city.getValue());
        }
        for (Map.Entry<Integer, String> city : cities.entrySet()) {
            if (city.getValue().equals("New York")) {
                cities.remove(city.getKey());
                break;

//            }if( city.getValue().equals("Staten Island")){
//                cities.remove(city.getKey());
//
//                if (city.getValue().equals("Bronx")) {
//                    cities.remove(city.getKey());
//
//                }


                //     }
//                ArrayList<String> listToDelete = new ArrayList<>(Arrays.asList("New York", "Staten Island", "Bronx"));
//
//                int[] keysToDelete = new int[3];
//                int index = 0;
//
//                for (Map.Entry<Integer, String> city : cities.entrySet()) {
//                    if (listToDelete.contains(city.getValue())) {
//                        keysToDelete[index++] = city.getKey();
//                    }
//                }
//
//                for (int i = 0; i < keysToDelete.length; i++) {
//                    cities.remove(keysToDelete[i]);
//                }
//
//                System.out.println("cities = " + cities);
//
//
//                for (Map.Entry<Integer, String> city : cities.entrySet()) {
//                    // cities.replace(city.getKey(), city.getValue().concat(" City")); // First Way
//                    cities.compute(city.getKey(), (key, value) -> value.concat(" City")); // Second Way
//                }
//
//                // System.out.println(cities);
//
//                int[] key = {14894, 10506, 14893, 10451};
//                String[] values = {"Wellsburg City", "Bedford Hills City", "Wayne City", "Bronx City"};

//                for (int i = 0; i < key.length; i++) {
//                    for (int j = 0; j < values.length; j++) {
//                        cities.putIfAbsent(key[i], values[j].t);
//                    }
//
//                }
//                System.out.println();
//                System.out.println(cities);
            }
        }
    }
}
