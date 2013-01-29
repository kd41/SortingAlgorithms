package com.sort.algorithms.service.impl;

import java.util.Arrays;

public class JavaSort extends BaseSort {

  public JavaSort(int[] array) {
    super(array);
  }

  @Override
  public void sort() throws Exception {
    Arrays.sort(array);
  }

}
