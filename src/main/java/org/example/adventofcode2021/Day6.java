package org.example.adventofcode2021;

import java.util.ArrayList;
import java.util.Arrays;

public class Day6 extends Day {
  private static final int ADULT_CYCLE = 6;
  private static final int BABY_CYCLE = 8;
  private static final int DAYS_PART1 = 80;

  private ArrayList<Integer> getInput() {
    Integer[] input = {4, 1, 1, 4, 1, 1, 1, 1, 1, 1, 1, 1, 3, 4, 1, 1, 1, 3, 1, 3, 1, 1, 1, 1,
        1, 1, 1, 1, 1, 3, 1, 3, 1, 1, 1, 5, 1, 2, 1, 1, 5, 3, 4, 2, 1, 1, 4, 1, 1, 5, 1, 1, 5, 5, 1,
        1, 5, 2, 1, 4, 1, 2, 1, 4, 5, 4, 1, 1, 1, 1, 3, 1, 1, 1, 4, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
        1, 1, 1, 1, 1, 5, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 2, 4, 4, 1, 1, 3, 1, 3, 2, 4, 3, 1, 1, 1, 1,
        1, 2, 1, 1, 1, 1, 2, 5, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 4, 1, 5, 1, 3, 1, 1, 1,
        1, 1, 5, 1, 1, 1, 3, 1, 2, 1, 2, 1, 3, 4, 5, 1, 1, 1, 1, 1, 1, 5, 1, 1, 1, 1, 1, 1, 1, 1, 3,
        1, 1, 3, 1, 1, 4, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 3, 2, 1, 1, 1, 4, 2, 1, 1, 1, 4, 1, 1, 2, 3,
        1, 4, 1, 5, 1, 1, 1, 2, 1, 5, 3, 3, 3, 1, 5, 3, 1, 1, 1, 1, 1, 1, 1, 1, 4, 5, 3, 1, 1, 5, 1,
        1, 1, 4, 1, 1, 5, 1, 2, 3, 4, 2, 1, 5, 2, 1, 2, 5, 1, 1, 1, 1, 4, 1, 2, 1, 1, 1, 2, 5, 1, 1,
        5, 1, 1, 1, 3, 2, 4, 1, 3, 1, 1, 2, 1, 5, 1, 3, 4, 4, 2, 2, 1, 1, 1, 1, 5, 1, 5, 2};
    return new ArrayList<>(Arrays.asList(input));
  }

  void part1() {
    var fishList = getInput();

    for (int i = 0; i < DAYS_PART1; i++) {
      // Decrement each fish and collect the number of new babies.
      int babies = 0;
      for (int j = 0; j < fishList.size(); j++) {
        var fish = fishList.get(j);
        if (fish == 0) {
          babies++;
          fishList.set(j, ADULT_CYCLE);
        } else {
          fish--;
          fishList.set(j, fish);
        }
      }

      // Add the babies
      for (int k = 0; k < babies; k++) {
        fishList.add(BABY_CYCLE);
      }
    }

    System.out.println("Part 1. Number of fish: " + fishList.size());
  }

  void part2() {

    System.out.println("Part 2 not implemented yet.");
  }
}
