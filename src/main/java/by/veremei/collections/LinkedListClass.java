package by.veremei.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {
    private final LinkedList<String> list = new LinkedList<>();

    public void addElement(String element) {
        list.add(element);
    }

    public void removeElement(String element) {
        list.remove(element);
    }

    public boolean searchElement(String element) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(element)) {
                return true;
            }
        }
        return false;
    }
}
