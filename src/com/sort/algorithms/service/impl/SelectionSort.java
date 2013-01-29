package com.sort.algorithms.service.impl;


/**
 * * A selection sort demonstration algorithm * SortAlgorithm.java, Thu Oct 27 10:32:35 1994 * * @author Jason Harrison@cs.ubc.ca * @version 1.0, 23
 * Jun 1995 *
 */
public class SelectionSort extends BaseSort {

  public SelectionSort(int[] array) {
    super(array);
  }

  @Override
  public void sort() throws Exception {
    for (int i = 0; i < array.length; i++) {
      int min = i;
      int j; /* * Find the smallest element in the unsorted list */
      for (j = i + 1; j < array.length; j++) {
        if (array[j] < array[min]) {
          min = j;
        }
      } /* * Swap the smallest unsorted element into the end of the * sorted list. */
      int T = array[min];
      array[min] = array[i];
      array[i] = T;
    }
  }
}
