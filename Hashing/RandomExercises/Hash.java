package com.company;

import java.util.Enumeration;
import java.util.Hashtable;

public class Hash {

    private static final int ARRAY_SIZE = 11;

    private int hashInteger(int key) {
        return key % ARRAY_SIZE;
    }

    // checks if array2 is a subset of array1
    public boolean isSubset(int[] array1, int[] array2) {

        if(array2.length > array1.length) return false;

        if(array2.length == 0) return true;

        int[] buckets = new int[ARRAY_SIZE];
        int collisions = 0;
        int index;

        for(int num:array1) {
            index = hashInteger(num);
            buckets[index] = num;
        }

        for(int num:array2) {
            index = hashInteger(num);

            if(num == buckets[index])
                collisions++;
        }

        if(collisions == array2.length) return true;

        return false;
    }

    public void findItinerary(Hashtable<String,String> itinerary) {

        Hashtable<String,String> reverseTable = new Hashtable<String,String>();
        String key = "";
        String beginning = "";
        String next = "";

        itinerary.forEach((k,v) -> { reverseTable.put(v,k);});

        // find the beginning
        Enumeration<String> keys = itinerary.keys();

        while(keys.hasMoreElements()) {

            key = keys.nextElement();

            if(!reverseTable.containsKey(key)) {
                beginning = key;
                break;
            }
        }

        // print out path
        for(int i = 0; i < itinerary.size(); i++) {

            next = itinerary.get(beginning);

            System.out.print(beginning + "-->" + next + " ");
            beginning = next;
        }
    }
}
