package by.veremei.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {
    private final HashSet<String> set = new HashSet<>();

    public void addElement(String element) {
        set.add(element);
    }

    public void removeElement(String element) {
        set.remove(element);
    }

    public boolean searchElement(String element) {
        Iterator<String> iterator = set.iterator();
        do {
            if (iterator.next().equals(element)) {
                return true;
            }
        } while (iterator.hasNext());
        return false;
    }
}
