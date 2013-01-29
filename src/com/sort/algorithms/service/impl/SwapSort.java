package com.sort.algorithms.service.impl;

/**
 * Algorithm don't work by some properties!!!
 */
public class SwapSort extends BaseSort {
  public SwapSort(int[] array) {
    super(array);
  }

  @Override
  public void sort() {
    int max = array[0];
    for (int i = 1; i < array.length; i++) {
      if (max < array[i]) {
        max = array[i];
      }
    }
    double f = (array.length - 1.0) / max;
    for (int i = array.length; --i >= 0;) {
      array[i] = (int) (i / f);
    }
    for (int i = array.length; --i >= 0;) {
      int j = (int) (i * Math.random());
      int t = array[i];
      array[i] = array[j];
      array[j] = t;
    }
    int T = array[0];
    int S = array[1];
    for (int i = 0; i < array.length; i++) {
      S = array[(int) (T * f)];
      if (T == S) {
        T = array[(int) (Math.random() * array.length)];
        S = array[(int) (T * f)];
      }
      array[(int) (T * f)] = T;
      T = S;
    }
  }
}