package com.sort.algorithms.service.impl;

/**
 * A shell sort demonstration algorithm SortAlgorithm.java, Thu Oct 27 10:32:35 1994 Note: Invented by Donald Lewis Shell [CACM, July, 1959, pages
 * 30-32] * @author Jason Harrison@cs.ubc.ca * @version 1.0, 23 Jun 1995 * @version 1.1, 12 Apr 2000 * -- fixed
 * java.lang.ArrayIndexOutOfBoundsException * Joel Berry <jmbshifty@yahoo.com> found this bug http://www.auto.tuwien.ac.at/~blieb/woop/shell.html * *
 * Shellsort is a simple extension of insertion sort which gains speed * by allowing exchanges of elements that are far apart. The idea is * to
 * rearrange the array to give it the property that every hth * element (starting anywhere) yields a sorted array. Such an array * is said to be
 * h-sorted. * * By h-sorting for some large values of h, we can move elements in * the array long distances and thus make it easier to h-sort for *
 * smaller values of h. Using such a procedure for any sequence of * values h which ends in 1 will produce a sorted array.
 */
public class ShellSort extends BaseSort {
  public ShellSort(int[] array) {
    super(array);
  }

  @Override
  public void sort() throws Exception {
    int h = 1;
    while ((h * 3 + 1) < array.length) {
      h = 3 * h + 1;
    }
    while (h > 0) {
      for (int i = h - 1; i < array.length; i++) {
        int B = array[i];
        int j = i;
        for (j = i; (j >= h) && (array[j - h] > B); j -= h) {
          array[j] = array[j - h];
        }
        array[j] = B;
      }
      h = h / 3;
    }
  }
}
