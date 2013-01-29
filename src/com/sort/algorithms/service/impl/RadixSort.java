package com.sort.algorithms.service.impl;

/**
 * Only for positive numbers!
 */
public class RadixSort extends BaseSort {
  private int bits;

  public RadixSort(int[] array) {
    this(array, 4);
  }

  public RadixSort(int[] array, int bits) {
    super(array);
    this.bits = bits;
  }

  @Override
  public void sort() throws Exception {
    int[] b = new int[array.length];
    int[] b_orig = b;

    int rshift = 0;
    for (int mask = ~(-1 << bits); mask != 0; mask <<= bits, rshift += bits) {
      int[] cntarray = new int[1 << bits];
      for (int p = 0; p < array.length; ++p) {
        int key = (array[p] & mask) >> rshift;
        ++cntarray[key];
      }

      for (int i = 1; i < cntarray.length; ++i) {
        cntarray[i] += cntarray[i - 1];
      }

      for (int p = array.length - 1; p >= 0; --p) {
        int key = (array[p] & mask) >> rshift;
        --cntarray[key];
        b[cntarray[key]] = array[p];
      }

      int[] temp = b;
      b = array;
      array = temp;
    }

    if (array == b_orig) {
      System.arraycopy(array, 0, b, 0, array.length);
    }
  }
}