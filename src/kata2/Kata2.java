package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        String[] data = {"Aashish", "Aashish", "Carlos", "Rosa", "Aashish", "Rosa"};
        
        Histogram histo = new Histogram(data);
        Map<String, Integer> histogram = histo.getHistogram();
        
        if (!histogram.isEmpty()) {
            for (Map.Entry<String, Integer> entry : histogram.entrySet()) {
                System.out.println("Key -> " + entry.getKey() + ", Value -> " + entry.getValue());
            }
        }
 
    }
    
}
