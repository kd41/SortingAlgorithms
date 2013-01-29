package com.sort.algorithms.service.impl;


/**
 * * A merge sort demonstration algorithm using extra space * SortAlgorithm.java, Thu Oct 27 10:32:35 1994 * * @author Jack Snoeyink@cs.ubc.ca * @version
 * 1.0, 09 Jan 97
 */
public class ExtraStorageMergeSort extends BaseSort {
  public ExtraStorageMergeSort(int[] array) {
    super(array);
  }

  @Override
  public void sort() throws Exception {
    int scratch[] = new int[array.length];
    sort(array, 0, array.length - 1, scratch);
  }

  private void sort(int a[], int lo, int hi, int scratch[]) {
    if (lo >= hi) {
      return; /* a[lo] is sorted already */
    }
    int mid = (lo + hi) / 2;
    sort(a, lo, mid, scratch); /* Sort sublist a[lo..mid] */
    sort(a, mid + 1, hi, scratch); /* Sort sublist a[mid+1..hi] */
    int k, t_lo = lo, t_hi = mid + 1;
    for (k = lo; k <= hi; k++)
      /* Merge sorted sublists */if ((t_lo <= mid) && ((t_hi > hi) || (a[t_lo] < a[t_hi]))) {
        scratch[k] = a[t_lo++];
      } else {
        scratch[k] = a[t_hi++];
      }
    for (k = lo; k <= hi; k++) {
      a[k] = scratch[k]; /* Copy back to a */
    }
  }
}
