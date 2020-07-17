package com.galvanize.fundamentals.dataStrcuturesAndAlgorithms;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListManipulation  {


    // Implement the sortArray method below below
    public ArrayList<String> sortArray(String[] inputArray) {
        ArrayList<String> sortedArrayList = new ArrayList<>();
        for (String str: inputArray) {
            sortedArrayList.add(str);
        }

        sortedArrayList.sort(Comparator.naturalOrder());
        return  sortedArrayList;

    }
}