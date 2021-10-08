package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 8, 8, 4, 3, 2, 1, 5, 6, 7, 9, 0, 0};
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        
        if (!histogram.isEmpty()) {
            for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
                System.out.println("Key -> " + entry.getKey() + ", Value -> " + entry.getValue());
            }
        }
 
    }
    
}
