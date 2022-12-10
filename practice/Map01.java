package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "100");
        map.put("b", "200");
        map.put("c", "300");
        map.put("c", "수정값");

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = map.get(key);

            System.out.println(key + " : " + value);
        }
    }
}
