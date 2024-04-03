package org.example;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExamplePointer {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(2);
        integers.add(1);
        integers.add(3);

        Iterator here = integers.iterator();

        here.next();
        here.next();
        here.remove(); // remove the element before the pointer because we haven't visited the element yet.
    }
}
