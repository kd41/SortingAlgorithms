package com.sort.algorithms.impl;

/**
 * * A bi-directional bubble sort demonstration algorithm * SortAlgorithm.java, Thu Oct 27 10:32:35 1994
 *
 * * @author James Gosling
 * @version 1.6f, 31
 * Jan 1995
 */
public class BidirectionalBubbleSort {

   public static void sort(int[] array) {
      int j;
      int limit = array.length;
      int st = -1;
      while (st < limit) {
         boolean flipped = false;
         st++;
         limit--;
         for (j = st; j < limit; j++) {
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
         for (j = limit; --j >= st;) {
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
