package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 8, 8, 4, 3, 2, 1, 5, 6, 7, 9, 0, 0};
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < data.length; i++) {
            if (histogram.containsKey(data[i])) {
                histogram.put(data[i], histogram.get(data[i]) + 1);
            } else {
                histogram.put(data[i], 1);
            }
        }
        
        if (!histogram.isEmpty()) {
            for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
                System.out.println("Key -> " + entry.getKey() + ", Value -> " + entry.getValue());
            }
        }
 
    }
    
}
