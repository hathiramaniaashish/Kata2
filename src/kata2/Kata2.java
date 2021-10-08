package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        Integer[] data = {1, 2, 3, 4, 8, 8, 4, 3, 2, 1, 5, 6, 7, 9, 0, 0};
        
        Histogram histo = new Histogram(data);
        Map<Integer, Integer> histogram = histo.getHistogram();
        
        if (!histogram.isEmpty()) {
            for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
                System.out.println("Key -> " + entry.getKey() + ", Value -> " + entry.getValue());
            }
        }
 
    }
    
}
