package by.veremei;

import by.veremei.collections.ArrayListClass;
import by.veremei.collections.HashMapClass;
import by.veremei.collections.HashSetClass;
import by.veremei.collections.LinkedListClass;

public class Main {
    private static final String FIRST_ELEMENT = "First";
    private static final String SECOND_ELEMENT = "Second";

    public static void main(String[] args) {

        ArrayListClass arrayListClass = new ArrayListClass();
        ArrayListClass.addElement(FIRST_ELEMENT);
        ArrayListClass.addElement(SECOND_ELEMENT);
        System.out.println("ArrayList: " + arrayListClass.searchElement(FIRST_ELEMENT));
        arrayListClass.removeElement(FIRST_ELEMENT);
        System.out.println("ArrayList: " + arrayListClass.searchElement(FIRST_ELEMENT));

        LinkedListClass linkedListClass = new LinkedListClass();
        linkedListClass.addElement(FIRST_ELEMENT);
        linkedListClass.addElement(SECOND_ELEMENT);
        System.out.println("LinkedList: " + linkedListClass.searchElement(FIRST_ELEMENT));
        linkedListClass.removeElement(FIRST_ELEMENT);
        System.out.println("LinkedList: " + linkedListClass.searchElement(FIRST_ELEMENT));

        HashSetClass hashSetClass = new HashSetClass();
        hashSetClass.addElement(FIRST_ELEMENT);
        hashSetClass.addElement(SECOND_ELEMENT);
        System.out.println("HashSet: " + hashSetClass.searchElement(FIRST_ELEMENT));
        hashSetClass.removeElement(FIRST_ELEMENT);
        System.out.println("HashSet: " + hashSetClass.searchElement(FIRST_ELEMENT));

        HashMapClass hashMapClass = new HashMapClass();
        hashMapClass.addElement(1, FIRST_ELEMENT);
        hashMapClass.addElement(2, SECOND_ELEMENT);
        System.out.println("HashMap: " + hashMapClass.searchElement(FIRST_ELEMENT));
        hashMapClass.removeElement(1);
        System.out.println("HashMap: " + hashMapClass.searchElement(FIRST_ELEMENT));
    }
}