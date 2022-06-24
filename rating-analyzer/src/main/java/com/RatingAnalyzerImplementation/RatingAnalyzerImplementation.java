package com.RatingAnalyzerImplementation;

import org.stats.RatingAnalyzer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RatingAnalyzerImplementation implements RatingAnalyzer {
    private final int[] ratings;

    public RatingAnalyzerImplementation(int[] ratings) throws IllegalArgumentException{
        this.ratings = ratings;
    }

    @Override
    public double mean() {
        double sum = 0;
        for(int number : ratings) {
            sum += number;
        }
        return sum / ratings.length;
    }

    @Override
    public double median() {
        // sort the ratings array
        Arrays.sort(ratings, 0, ratings.length);

        // division by default will round down if there is a remainder
        int midPoint = ratings.length / 2;
        // telling intellij to cast the fraction's numerator to a double
        // this will get rid of the warning " integer division in floating-point context" intellij displays
        if (ratings.length % 2 == 0) {
            return ((double)(ratings[midPoint] + ratings[midPoint - 1]) / 2);
        } else {
            return ratings[midPoint];
        }
    }
    @Override
    // function should run in O(nLog(n)) Time and O(n) Space
    public int[] mode() {
        // create max, used for finding the mode and create int[] modesArr
        int max = 0;
        int[] modesArr = {};

        // create and populate the number occurrence tracker and find the max occurrence
        Map<Integer, Integer> counter = new HashMap<>();
        for (int number : ratings) {
            if (!counter.containsKey(number)) {
                counter.put(number, 1);
            } else {
                counter.put(number, counter.get(number) + 1);
            }
            max = Math.max(max, counter.get(number));
        }

        // only adds unique values to the int[] modesArr
        for (int number : ratings) {
            boolean contains = false;
            // if this check finds a duplicate, don't add it to the modes arr
            for (int currentNumber : modesArr) {
                if (currentNumber == number) {
                    contains = true;
                    break;
                }
            }

            // increase the size of the int[] modesArr by 1, then add the number to the int[]
            // no need to check if it is already in the modesArr, that check was done in the above for loop
            if(counter.get(number) == max && !contains) {
                modesArr = Arrays.copyOf(modesArr, modesArr.length + 1);
                modesArr[modesArr.length - 1] = number;
            }
        }

        // sort the modesArr, Arrays.sort sorts/modifies the modesArr in place
        Arrays.sort(modesArr, 0, modesArr.length);
        return modesArr;
    }
}
