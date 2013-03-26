package com.sort.algorithms.impl;

import com.sort.algorithms.Program;

/**
 * Note: we know that, given an array of integers, its maximum and minimum values can be always found; but if we imagine the worst case for an array
 * of 32 bit integers, we see that in order to hold the counts, we need an array of 2^32 elements, i.e., we need, to hold a count value up to 2^32-1,
 * more or less 4 Gbytes. So the counting sort is more practical when the range is (very) limited and minimum and maximum values are known a priori.
 */
public class CountingSort {
  private static int min = -Program.MAX_RANDOM;
  private static int max = Program.MAX_RANDOM;

  public static void sort(int[] array) {
    int[] count = new int[max - min + 1];
    for (int number : array) {
      count[number - min]++;
    }
    int z = 0;
    for (int i = min; i <= max; i++) {
      while (count[i - min] > 0) {
        array[z] = i;
        z++;
        count[i - min]--;
      }
    }
  }
}
