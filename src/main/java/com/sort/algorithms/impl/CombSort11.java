package com.sort.algorithms.impl;

/**
 * A comb sort 11 sort demonstration algorithm * Idea from Byte April 1991 by Richard Box and Stephen Lacey * Michele Estebon (mestebon@vt.edu)
 * brought this to my attention. * * SortAlgorithm.java, Thu Oct 27 10:32:35 1994 * * @author Jason Harrison@cs.ubc.ca * @version 1.0, 20 Nov 1996 *
 */
public class CombSort11 {
  private static final float SHRINKFACTOR = 1.3F;

  public static void sort(int[] array) {
    boolean flipped;
    int gap, top;
    int i, j;
    gap = array.length;
    do {
      gap = (int) (gap / SHRINKFACTOR);
      switch (gap) {
      case 0:
        gap = 1;
        break;
      case 9:
      case 10:
        gap = 11;
        break;
      default:
        break;
      }
      flipped = false;
      top = array.length - gap;
      for (i = 0; i < top; i++) {
        j = i + gap;
        if (array[i] > array[j]) {
          int T = array[i];
          array[i] = array[j];
          array[j] = T;
          flipped = true;
        }
      }
    } while (flipped || (gap > 1));
  }
}
