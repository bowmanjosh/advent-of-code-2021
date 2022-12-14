package org.example.adventofcode2021;

import java.util.Scanner;

public final class Main {
  public static void main(String[] args) {
    System.out.println("Choose a day by entering an integer: ");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    int inputDay;
    try {
      inputDay = Integer.parseInt(input);
    } catch (NumberFormatException e) {
      System.out.println("Input was not an integer. Stack trace: ");
      e.printStackTrace();
      return;
    }

    Day objectDay;
    switch (inputDay) {
      case 1 -> {
        objectDay = new Day1();
      }
      case 2 -> {
        objectDay = new Day2();
      }
      case 3 -> {
        objectDay = new Day3();
      }
      case 4 -> {
        objectDay = new Day4();
      }
      case 5 -> {
        objectDay = new Day5();
      }
      case 6 -> {
        objectDay = new Day6();
      }
      case 7 -> {
        objectDay = new Day7();
      }
      default -> {
        System.out.println("You have chosen a day which is not yet implemented");
        return;
      }
    }
    objectDay.part1();
    objectDay.part2();
  }
}
