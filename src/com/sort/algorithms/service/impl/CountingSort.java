package com.sort.algorithms.service.impl;

/**
 * Note: we know that, given an array of integers, its maximum and minimum values can be always found; but if we imagine the worst case for an array
 * of 32 bit integers, we see that in order to hold the counts, we need an array of 2^32 elements, i.e., we need, to hold a count value up to 2^32-1,
 * more or less 4 Gbytes. So the counting sort is more practical when the range is (very) limited and minimum and maximum values are known a priori.
 */
public class CountingSort extends BaseSort {
  private int min;
  private int max;

  /**
   * Do not use this constructor because sort will be very slow.
   */
  @Deprecated
  public CountingSort(int[] array) {
    this(array, Integer.MIN_VALUE + 1, Integer.MAX_VALUE - 1);
  }

  public CountingSort(int[] array, int min, int max) {
    super(array);
    this.min = min;
    this.max = max;
  }

  @Override
  public void sort() throws Exception {
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
