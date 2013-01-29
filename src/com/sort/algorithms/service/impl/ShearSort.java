package com.sort.algorithms.service.impl;

public class ShearSort extends BaseSort {
  private int log;
  private int rows;
  private int cols;

  public ShearSort(int[] array) {
    super(array);
  }

  @Override
  public void sort() throws Exception {
    int pow = 1;
    int div = 1;

    for (int i = 1; i * i <= array.length; i++) {
      if (array.length % i == 0) {
        div = i;
      }
    }
    rows = div;
    cols = array.length / div;
    for (log = 0; pow <= rows; log++) {
      pow = pow * 2;
    }

    for (int k = 0; k < log; k++) {
      for (int j = 0; j < cols / 2; j++) {
        for (int i = 0; i < rows; i++) {
          sortPart1(array, i * cols, (i + 1) * cols, 1, (i % 2 == 0 ? true : false));
        }
        for (int i = 0; i < rows; i++) {
          sortPart2(array, i * cols, (i + 1) * cols, 1, (i % 2 == 0 ? true : false));
        }
      }
      for (int j = 0; j < rows / 2; j++) {
        for (int i = 0; i < cols; i++) {
          sortPart1(array, i, rows * cols + i, cols, true);
        }
        for (int i = 0; i < cols; i++) {
          sortPart2(array, i, rows * cols + i, cols, true);
        }
      }
    }
    for (int j = 0; j < cols / 2; j++) {
      for (int i = 0; i < rows; i++) {
        sortPart1(array, i * cols, (i + 1) * cols, 1, true);
      }
      for (int i = 0; i < rows; i++) {
        sortPart2(array, i * cols, (i + 1) * cols, 1, true);
      }
    }
  }

  private void sortPart1(int a[], int min, int max, int x, boolean isUp) {
    for (int i = min; i + x < max; i += 2 * x) {
      sortPart(a, x, isUp, i);
    }
  }

  private void sortPart2(int a[], int min, int max, int x, boolean isUp) {
    for (int i = min + x; i + x < max; i += 2 * x) {
      sortPart(a, x, isUp, i);
    }
  }

  private void sortPart(int a[], int x, boolean isUp, int i) {
    if ((isUp && a[i] > a[i + x]) || !isUp && a[i] < a[i + x]) {
      int t = a[i];
      a[i] = a[i + x];
      a[i + x] = t;
    }
  }

}
