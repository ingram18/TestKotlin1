package com.tnp.testJava1.lottery;

import java.util.HashSet;
import java.util.Set;

public abstract class NumberGame {

    Set<Integer> numbers = new HashSet<>();
    int numberCount = 0;
    public int testInt = 0;
    public abstract void generate();
    public boolean validate() {
        if (numberCount == numbers.size()) {
            return true;
        } else {
            return false;
        }
    }

}
