package com.sort.algorithms.impl;

/**
 * * A bubble sort demonstration algorithm * SortAlgorithm.java, Thu Oct 27 10:32:35 1994
 *
 * * @author James Gosling
 * @version 1.6, 31 Jan 1995 * *
 * Modified 23 Jun 1995 by Jason Harrison@cs.ubc.ca: * Algorithm completes early when no items have been swapped in the * last pass.
 */
public class BubbleSort {

   public static void sort(int[] array) {
      for (int i = array.length; --i >= 0;) {
         boolean flipped = false;
         for (int j = 0; j < i; j++) {
            if (array[j] > array[j + 1]) {
               int T = array[j];
               array[j] = array[j + 1];
               array[j + 1] = T;
               flipped = true;
            }
         }
         if (!flipped) {
            return;
         }
      }
   }
}
