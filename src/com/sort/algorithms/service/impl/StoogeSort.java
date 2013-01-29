package com.sort.algorithms.service.impl;

public class StoogeSort extends BaseSort {

  public StoogeSort(int[] array) {
    super(array);
  }

  @Override
  public void sort() throws Exception {
    stoogeSort(array, 0, array.length - 1);
  }

  public void stoogeSort(int[] a, int i, int j) {
    if (a[j] < a[i]) {
      int tmp = a[i];
      a[i] = a[j];
      a[j] = tmp;
    }
    if (j - i > 1) {
      int t = (j - i + 1) / 3;
      stoogeSort(a, i, j - t);
      stoogeSort(a, i + t, j);
      stoogeSort(a, i, j - t);
    }
  }

}
