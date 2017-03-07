package com.scujcc.david.corejavavolumeI.treeSet;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by David on 3/7/17.
 */
public class TreeSetTest {

    public static void main(String[] args) {
        SortedSet<Item> parts = new TreeSet<>();
        parts.add(new Item("Toaster", 1234));
        parts.add(new Item("Widget", 4562));
        parts.add(new Item("Modem", 9912));
        System.out.println(parts);

        SortedSet<Item> sortByDescription = new TreeSet<>(new Comparator<Item>() {
            @Override
            public int compare(Item a, Item b) {
                String descA = a.getDescription();
                String descB = b.getDescription();
                return descA.compareTo(descB);
            }
        });

        sortByDescription.addAll(parts);
        System.out.println(sortByDescription);
    }

}
