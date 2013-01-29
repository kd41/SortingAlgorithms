package com.sort.algorithms.service.impl;

/**
 * * A heap sort demonstration algorithm * SortAlgorithm.java, Thu Oct 27 10:32:35 1994 * * @author Jason Harrison@cs.ubc.ca * @version 1.0, 23 Jun
 * 1995
 */
public class HeapSort extends BaseSort {

  public HeapSort(int[] array) {
    super(array);
  }

  @Override
  public void sort() throws Exception {
    int N = array.length;
    for (int k = N / 2; k > 0; k--) {
      downheap(array, k, N);
    }
    do {
      int T = array[0];
      array[0] = array[N - 1];
      array[N - 1] = T;
      N = N - 1;
      downheap(array, 1, N);
    } while (N > 1);
  }

  private void downheap(int a[], int k, int N) {
    int T = a[k - 1];
    while (k <= N / 2) {
      int j = k + k;
      if ((j < N) && (a[j - 1] < a[j])) {
        j++;
      }
      if (T >= a[j - 1]) {
        break;
      } else {
        a[k - 1] = a[j - 1];
        k = j;
      }
    }
    a[k - 1] = T;
  }
}