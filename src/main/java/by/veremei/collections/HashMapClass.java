package by.veremei.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    private final HashMap<Integer, String> map = new HashMap<>();

    public void addElement(int key, String value) {
        map.put(key, value);
    }

    public void removeElement(int key) {
        map.remove(key);
    }

    public boolean searchElement(String value) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                return true;
            }
        }
        return false;
    }
}
