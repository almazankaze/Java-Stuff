package com.company;

import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {

        Hash hash = new Hash();

        // is second array a subset of first array
        int[] array1 = {11,1,13,21,3,7};
        int[] array2 = {11,3,7,1};

        int[] array3 = {10,5,2,23,19};
        int[] array4 = {19,5,3};

        if(hash.isSubset(array3, array4))
            System.out.println("second array is a subset of first array");
        else
            System.out.println("second array is not a subset of first array");


        // get path of itinerary
        Hashtable<String,String> hashtable = new Hashtable<String, String>();
        hashtable.put("Chennai","Banglore");
        hashtable.put("Bombay","Delhi");
        hashtable.put("Goa","Chennai");
        hashtable.put("Delhi","Goa");

        hash.findItinerary(hashtable);
    }
}
