package com.sort.algorithms.service.impl;

public class BucketSort extends BaseSort {

  public BucketSort(int[] array) {
    super(array);
  }

  @Override
  public void sort() throws Exception {
    int len = array.length;
    if (len <= 0) {
      return;
    }

    int min = array[0];
    int max = min;
    for (int i = 1; i < len; i++)
      if (array[i] > max) {
        max = array[i];
      } else if (array[i] < min) {
        min = array[i];
      }

    int bucket[] = new int[max - min + 1];
    for (int i = 0; i < len; i++) {
      bucket[array[i] - min]++;
    }

    int i = 0;
    for (int b = 0; b < bucket.length; b++) {
      for (int j = 0; j < bucket[b]; j++) {
        array[i++] = b + min;
      }
    }
  }

}
