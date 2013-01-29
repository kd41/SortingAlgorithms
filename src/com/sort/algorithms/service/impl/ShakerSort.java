package com.sort.algorithms.service.impl;


/**
 * * A shaker sort demonstration algorithm * SortAlgorithm.java, Thu Oct 27 10:32:35 1994 * * @author Jason Harrison@cs.ubc.ca * @version 1.0, 26 Jun
 * 1995 *
 */
public class ShakerSort extends BaseSort {
  public ShakerSort(int[] array) {
    super(array);
  }

  @Override
  public void sort() {
    int i = 0;
    int k = array.length - 1;
    while (i < k) {
      int min = i;
      int max = i;
      int j;
      for (j = i + 1; j <= k; j++) {
        if (array[j] < array[min]) {
          min = j;
        }
        if (array[j] > array[max]) {
          max = j;
        }
      }
      int T = array[min];
      array[min] = array[i];
      array[i] = T;
      if (max == i) {
        T = array[min];
        array[min] = array[k];
        array[k] = T;
      } else {
        T = array[max];
        array[max] = array[k];
        array[k] = T;
      }
      i++;
      k--;
    }
  }
}
