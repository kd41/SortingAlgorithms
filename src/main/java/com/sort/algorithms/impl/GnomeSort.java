package com.sort.algorithms.impl;

public class GnomeSort {

  public static void sort(int[] array) {
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
