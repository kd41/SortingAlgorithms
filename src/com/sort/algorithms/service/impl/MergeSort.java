package com.sort.algorithms.service.impl;


/**
 * * A merge sort demonstration algorithm * SortAlgorithm.java, Thu Oct 27 10:32:35 1994 * * @author Jason Harrison@cs.ubc.ca * @version 1.1, 12 Jan
 * 1998
 */
public class MergeSort extends BaseSort {
  public MergeSort(int[] array) {
    super(array);
  }

  @Override
  public void sort() {
    sort(array, 0, array.length - 1);
  }

  private void sort(int a[], int lo0, int hi0) {
    int lo = lo0;
    int hi = hi0;
    if (lo >= hi) {
      return;
    }
    int mid = (lo + hi) / 2; /* * Partition the list into two lists and sort them recursively */
    sort(a, lo, mid);
    sort(a, mid + 1, hi); /* * Merge the two sorted lists */
    int end_lo = mid;
    int start_hi = mid + 1;
    while ((lo <= end_lo) && (start_hi <= hi)) {
      if (a[lo] < a[start_hi]) {
        lo++;
      } else {
        /*
         * * a[lo] >= a[start_hi] * The next element comes from the second list, * move the a[start_hi] element into the next * position and shuffle
         * all the other elements up.
         */
        int T = a[start_hi];
        for (int k = start_hi - 1; k >= lo; k--) {
          a[k + 1] = a[k];
        }
        a[lo] = T;
        lo++;
        end_lo++;
        start_hi++;
      }
    }
  }
}
