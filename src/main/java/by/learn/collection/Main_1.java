package by.learn.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main_1 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("marina");
        c.add("ali");
        c.add("Vasya");
        Iterator<String> iter = c.iterator();

        while (iter.hasNext()) {
            String element = iter.next();
            System.out.println(element);
        }

        for (String element : c) {
            System.out.println(element);
        }


    }
}
