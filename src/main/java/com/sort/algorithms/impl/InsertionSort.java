package com.sort.algorithms.impl;


/**
 * * An insertion sort demonstration algorithm * SortAlgorithm.java, Thu Oct 27 10:32:35 1994 * * @author Jason Harrison@cs.ubc.ca * @version 1.0, 23
 * Jun 1995 *
 */
public class InsertionSort {

  public static void sort(int[] array) {
    for (int i = 1; i < array.length; i++) {
      int j = i;
      int B = array[i];
      while ((j > 0) && (array[j - 1] > B)) {
        array[j] = array[j - 1];
        j--;
      }
      array[j] = B;
    }
  }
}
