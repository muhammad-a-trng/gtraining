package com.galvanize.fundamentals.dataStrcuturesAndAlgorithms;

public class AccumulatorPatternEx {

    public String toSentence(String[] input) {
        if (input.length == 0 || "".equals(input[0])) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length; i++) {

            if (i > 0 && i < input.length - 1) {
                sb.append(", ");
            }

            if (i == input.length -1 ) {
                sb.append(" and ");
            }
            sb.append(input[i]);
        }
        return sb.toString();
    }
}
