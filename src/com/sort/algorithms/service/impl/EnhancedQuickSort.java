package com.sort.algorithms.service.impl;


public class EnhancedQuickSort extends BaseSort {
  public EnhancedQuickSort(int[] array) {
    super(array);
  }

  @Override
  public void sort() throws Exception {
    sort(array, 0, array.length - 1);
  }

  private void brute(int a[], int lo, int hi) {
    if ((hi - lo) == 1) {
      if (a[hi] < a[lo]) {
        int T = a[lo];
        a[lo] = a[hi];
        a[hi] = T;
      }
    }
    if ((hi - lo) == 2) {
      int pmin = a[lo] < a[lo + 1] ? lo : lo + 1;
      pmin = a[pmin] < a[lo + 2] ? pmin : lo + 2;
      if (pmin != lo) {
        int T = a[lo];
        a[lo] = a[pmin];
        a[pmin] = T;
      }
      brute(a, lo + 1, hi);
    }
    if ((hi - lo) == 3) {
      int pmin = a[lo] < a[lo + 1] ? lo : lo + 1;
      pmin = a[pmin] < a[lo + 2] ? pmin : lo + 2;
      pmin = a[pmin] < a[lo + 3] ? pmin : lo + 3;
      if (pmin != lo) {
        int T = a[lo];
        a[lo] = a[pmin];
        a[pmin] = T;
      }
      int pmax = a[hi] > a[hi - 1] ? hi : hi - 1;
      pmax = a[pmax] > a[hi - 2] ? pmax : hi - 2;
      if (pmax != hi) {
        int T = a[hi];
        a[hi] = a[pmax];
        a[pmax] = T;
      }
      brute(a, lo + 1, hi - 1);
    }
  }

  private void sort(int a[], int lo0, int hi0) {
    int lo = lo0;
    int hi = hi0;
    if ((hi - lo) <= 3) {
      brute(a, lo, hi);
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
