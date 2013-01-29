package com.sort.algorithms.service.impl;

public class GnomeSort extends BaseSort {

  public GnomeSort(int[] array) {
    super(array);
  }

  @Override
  public void sort() throws Exception {
    for (int index = 1; index < array.length;) {
      if (array[index - 1] <= array[index]) {
        ++index;
      } else {
        int tempVal = array[index];
        array[index] = array[index - 1];
        array[index - 1] = tempVal;
        --index;
        if (index == 0) {
          index = 1;
        }
      }
    }
  }
}
