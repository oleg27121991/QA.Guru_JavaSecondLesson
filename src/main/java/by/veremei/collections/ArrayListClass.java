package by.veremei.collections;

import java.util.ArrayList;

public class ArrayListClass {
    private final static ArrayList<String> list = new ArrayList<>();

    public static void addElement(String element) {
        list.add(element);
    }

    public void removeElement(String element) {
        list.remove(element);
    }

    public boolean searchElement(String element) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(element)) {
                return true;
            }
        }
        return false;
    }
}