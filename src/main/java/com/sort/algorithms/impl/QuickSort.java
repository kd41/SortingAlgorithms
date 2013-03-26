package com.sort.algorithms.impl;

public class QuickSort {

  public static void sort(int[] array) {
    sort(array, 0, array.length - 1);
  }

  private static void sort(int a[], int lo0, int hi0) {
    int lo = lo0;
    int hi = hi0;
    if (lo >= hi) {
      return;
    } else if (lo == hi - 1) {
      if (a[lo] > a[hi]) {
        int T = a[lo];
        a[lo] = a[hi];
        a[hi] = T;
      }
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
