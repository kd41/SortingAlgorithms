package com.sort.algorithms.impl;

public class CombSort {

  public static void sort(int[] array) {
    int gap = array.length;
    boolean swapped = true;
    while (gap > 1 || swapped) {
      if (gap > 1) {
        gap = (int) (gap / 1.3);
      }
      swapped = false;
      for (int i = 0; i + gap < array.length; i++) {
        if (array[i] - array[i + gap] > 0) {
          int t = array[i];
          array[i] = array[i + gap];
          array[i + gap] = t;
          swapped = true;
        }
      }
    }
  }
}
