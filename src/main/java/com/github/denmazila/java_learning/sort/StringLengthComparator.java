package com.github.denmazila.java_learning.sort;

import java.util.Comparator;

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}