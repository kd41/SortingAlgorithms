package com.sort.algorithms.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Extremely slow sort algorithm
 */
public class BogoSort {


  public static void sort(int[] array) {
    List<Integer> arrayList = new ArrayList<>();
    for (int i = 0; i < array.length - 1; i++) {
      arrayList.add(array[i]);
    }
    bogoSort(arrayList);
    for (int i = 0; i < array.length - 1; i++) {
      array[i] = arrayList.get(i);
    }
  }

  private static void bogoSort(List<Integer> list) {
    while (!isSorted(list)) {
      Collections.shuffle(list);
    }
  }

  private static boolean isSorted(List<Integer> list) {
    if (list.isEmpty()) {
      return true;
    }
    Iterator<Integer> it = list.iterator();
    Integer last = it.next();
    while (it.hasNext()) {
      Integer current = it.next();
      if (last.compareTo(current) > 0) {
        return false;
      }
      last = current;
    }
    return true;
  }
}
