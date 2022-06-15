package com.entertainment.client;

import com.entertainment.Television;

import java.util.HashSet;
import java.util.Set;

public class TelevisionClient {
    public static void main(String[] args) {
        Television tvA = new Television("Sony", 50);
        Television tvB = new Television("Sony", 33);
        Television tvC = new Television("Sony", 50);
        Television tvD = new Television("Sony", 24);

        System.out.printf("tvA == tvC: %s", tvA == tvC);
        System.out.println();
        System.out.printf("tvA == tvC: %s", tvA.equals(tvC));

        Set<Television> tvs = new HashSet<Television>();
        tvs.add(tvA);
        tvs.add(tvB);
        tvs.add(tvC);
        tvs.add(tvD);
        System.out.println(tvs.size());
        System.out.println(tvs);



    }
}
