package com.sort.algorithms.service.impl;

import static java.lang.System.out;

import com.sort.algorithms.service.Sortable;

public abstract class BaseSort implements Sortable {
  protected int[] array;

  public BaseSort(int[] array) {
    this.array = array;
  }

  @Override
  public void logArray(String message) {
    out.print(super.getClass().getName() + ".\t" + message);
    // for (int i = 0; i < this.array.length; i++) {
    // if ((i + 1) % 10 != 0 || i == 0) {
    // out.print("\t" + this.array[i]);
    // } else {
    // out.println("\t" + this.array[i]);
    // }
    // }
    out.println(". Is array sorted: " + checkSort());
  }

  @Override
  public boolean checkSort() {
    boolean isSorted = true;
    for (int i = 0; i < this.array.length - 1; i++) {
      if (array[i] > array[i + 1]) {
        // out.println(array[i] + ":" + array[i + 1] + ":" + i);
        isSorted = false;
        break;
      }
    }
    return isSorted;
  }
}
