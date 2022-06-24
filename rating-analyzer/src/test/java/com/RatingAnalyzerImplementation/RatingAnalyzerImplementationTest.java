package com.RatingAnalyzerImplementation;

import org.junit.jupiter.api.Test;
import org.stats.RatingAnalyzer;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RatingAnalyzerImplementationTest {
    @Test
    void mean() {
        int[] ratings = {3, 5, 2, 3, 4, 1, 3, 4, 3};
        RatingAnalyzer analyzer = RatingAnalyzer.newInstance(ratings);
        assertEquals(3.1111, analyzer.mean(), .001);

        int[] ratings2 = {2, 10, 21, 23, 23, 38, 38};
        RatingAnalyzer analyzer2 = RatingAnalyzer.newInstance(ratings2);
        assertEquals(22.142857142857142, analyzer2.mean(), .001);
    }

    @Test
    void median() {
        int[] ratings = {3, 5, 2, 3, 4, 1, 3, 4, 3};
        RatingAnalyzer analyzer = RatingAnalyzer.newInstance(ratings);
        assertEquals(3, analyzer.median(), .001);

        int[] ratings2 = {2, 10, 21, 23, 23, 38, 38};
        RatingAnalyzer analyzer2 = RatingAnalyzer.newInstance(ratings2);
        assertEquals(23, analyzer2.median(), .001);
    }

    @Test
    void mode() {
        int[] ratings = {3, 5, 2, 3, 4, 1, 3, 4, 3};
        RatingAnalyzer analyzer = RatingAnalyzer.newInstance(ratings);
        assertArrayEquals(new int[]{3}, analyzer.mode());

        int[] ratings2 = {2, 10, 21, 23, 23, 38, 38};
        RatingAnalyzer analyzer2 = RatingAnalyzer.newInstance(ratings2);
        assertArrayEquals(new int[]{23, 38}, analyzer2.mode());

        int[] ratings3 = {3};
        RatingAnalyzer analyzer3 = RatingAnalyzer.newInstance(ratings3);
        assertArrayEquals(new int[]{3}, analyzer3.mode());

        int[] ratings4 = {1, 2, 3};
        RatingAnalyzer analyzer4 = RatingAnalyzer.newInstance(ratings4);
        assertArrayEquals(new int[]{1, 2, 3}, analyzer4.mode());

        int[] ratings5 = {};
        RatingAnalyzer analyzer5 = RatingAnalyzer.newInstance(ratings5);
        assertArrayEquals(new int[]{}, analyzer5.mode());
    }
}