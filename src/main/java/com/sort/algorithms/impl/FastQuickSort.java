package com.sort.algorithms.impl;

public class FastQuickSort {

  public static void sort(int[] array) {
    quickSort(array, 0, array.length - 1);
    insertionSort(array, 0, array.length - 1);
  }

  private static void quickSort(int a[], int l, int r) {
    int M = 4;
    int i;
    int j;
    int v;
    if ((r - l) > M) {
      i = (r + l) / 2;
      if (a[l] > a[i]) {
        swap(a, l, i);
      }
      if (a[l] > a[r]) {
        swap(a, l, r);
      }
      if (a[i] > a[r]) {
        swap(a, i, r);
      }
      j = r - 1;
      swap(a, i, j);
      i = l;
      v = a[j];
      for (;;) {
        while (a[++i] < v) {
        }
        while (a[--j] > v) {
        }
        if (j < i) {
          break;
        }
        swap(a, i, j);
      }
      swap(a, i, r - 1);
      quickSort(a, l, j);
      quickSort(a, i + 1, r);
    }
  }

  private static void swap(int a[], int i, int j) {
    int T;
    T = a[i];
    a[i] = a[j];
    a[j] = T;
  }

  private static void insertionSort(int a[], int lo0, int hi0) {
    int i;
    int j;
    int v;
    for (i = lo0 + 1; i <= hi0; i++) {
      v = a[i];
      j = i;
      while ((j > lo0) && (a[j - 1] > v)) {
        a[j] = a[j - 1];
        j--;
      }
      a[j] = v;
    }
  }
}
