package com.RatingAnalyzerImplementation;

import org.stats.RatingAnalyzer;

import java.util.Arrays;
import java.util.Map;


import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class AnalyzerStreamsImplementation implements RatingAnalyzer {
    private final int[] ratings;

    public AnalyzerStreamsImplementation(int[] ratings) throws IllegalArgumentException{
        this.ratings = ratings;
    }

    @Override
    public double mean() {
        // using reduce
        // return (double) Arrays.stream(ratings).reduce(0, (a, b) -> a + b) / ratings.length;
        return (double) Arrays.stream(ratings).sum() / ratings.length;
    }

    @Override
    public double median() {
        // this methods doesn't need to use streams

        // sort the ratings array
        Arrays.sort(ratings);

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

    // function should run in O(nLog(n)) Time and O(n) Space
    @Override
    public int[] mode() {
        // create int[] modesArr and variable that holds the number of occurrences for the mode
        int[] modesArr = {};
        long max = 0;

        // create map that tracks the number of occurrences for each number and update the value of max
        Map<Integer, Long> frequencyMap = Arrays.stream(ratings).boxed().collect(groupingBy((key) -> key, counting()));
        for(long number : frequencyMap.values()) { max = Math.max(max, number);}

        // only add unique values to the int[] modesArr
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
            if(frequencyMap.get(number) == max && !contains) {
                modesArr = Arrays.copyOf(modesArr, modesArr.length + 1);
                modesArr[modesArr.length - 1] = number;
            }
        }
        // sort the modesArr, Arrays.sort sorts/modifies the modesArr in place
        Arrays.sort(modesArr);
        return modesArr;
    }
}
