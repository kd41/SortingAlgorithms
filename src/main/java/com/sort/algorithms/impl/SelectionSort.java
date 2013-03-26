package com.sort.algorithms.impl;

/**
 * * A selection sort demonstration algorithm * SortAlgorithm.java, Thu Oct 27 10:32:35 1994 * * @author Jason Harrison@cs.ubc.ca * @version 1.0, 23
 * Jun 1995 *
 */
public class SelectionSort {

  public static void sort(int[] array) {
    for (int i = 0; i < array.length; i++) {
      int min = i;
      int j;
      for (j = i + 1; j < array.length; j++) {
        if (array[j] < array[min]) {
          min = j;
        }
      }
      int T = array[min];
      array[min] = array[i];
      array[i] = T;
    }
  }
}
