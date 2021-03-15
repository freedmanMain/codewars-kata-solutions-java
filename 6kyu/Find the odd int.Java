//Given an array of integers, find the one that appears an odd number of times.
//
//There will always be only one integer that appears an odd number of times.

import java.util.*;

public class FindOdd {
    public static int findIt(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int current = a[i];
            if (Arrays.stream(a).filter(x -> x == current).count() % 2 != 0) {
                return current;
            }
        }
        return -1;
    }
}