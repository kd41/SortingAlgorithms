package com.sort.algorithms.service.impl;

/**
 * Second name: Exchange Sort
 */
public class QuickWithBubbleSort extends BaseSort {
  public QuickWithBubbleSort(int[] array) {
    super(array);
  }

  @Override
  public void sort() throws Exception {
    sort(array, 0, array.length - 1);
  }

  private void bsort(int a[], int lo, int hi) {
    for (int j = hi; j > lo; j--) {
      for (int i = lo; i < j; i++) {
        if (a[i] > a[i + 1]) {
          int T = a[i];
          a[i] = a[i + 1];
          a[i + 1] = T;
        }
      }
    }
  }

  private void sort(int a[], int lo0, int hi0) {
    int lo = lo0;
    int hi = hi0;
    if ((hi - lo) <= 6) {
      bsort(a, lo, hi);
      return;
    }
    int pivot = a[(lo + hi) / 2];
    a[(lo + hi) / 2] = a[hi];
    a[hi] = pivot;
    while (lo < hi) {
      while (a[lo] <= pivot && lo < hi) {
        lo++;
      }
      while (pivot <= a[hi] && lo < hi) {
        hi--;
      }
      if (lo < hi) {
        int T = a[lo];
        a[lo] = a[hi];
        a[hi] = T;
      }
    }
    a[hi0] = a[hi];
    a[hi] = pivot;
    sort(a, lo0, lo - 1);
    sort(a, hi + 1, hi0);
  }
}
