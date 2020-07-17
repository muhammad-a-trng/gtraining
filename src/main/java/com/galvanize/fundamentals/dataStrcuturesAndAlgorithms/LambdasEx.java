package com.galvanize.fundamentals.dataStrcuturesAndAlgorithms;

import java.util.List;

public class LambdasEx {

    public void parseFileNames(List<String> filenames) {
        filenames.forEach(filename -> System.out.println(filename.replaceAll(" ", "-")));
    }

}
