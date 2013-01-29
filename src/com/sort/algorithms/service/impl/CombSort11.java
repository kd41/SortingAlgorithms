package com.sort.algorithms.service.impl;

/**
 * A comb sort 11 sort demonstration algorithm * Idea from Byte April 1991 by Richard Box and Stephen Lacey * Michele Estebon (mestebon@vt.edu)
 * brought this to my attention. * * SortAlgorithm.java, Thu Oct 27 10:32:35 1994 * * @author Jason Harrison@cs.ubc.ca * @version 1.0, 20 Nov 1996 *
 */
public class CombSort11 extends BaseSort {
  final float SHRINKFACTOR = (float) 1.3;

  public CombSort11(int[] array) {
    super(array);
  }

  @Override
  public void sort() throws Exception {
    boolean flipped = false;
    int gap, top;
    int i, j;
    gap = array.length;
    do {
      gap = (int) (gap / SHRINKFACTOR);
      switch (gap) {
      case 0: /* the smallest gap is 1 - bubble sort */
        gap = 1;
        break;
      case 9: /* this is what makes this Combsort11 */
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
    } while (flipped || (gap > 1)); /* like the bubble and shell sorts we check for a clean pass */
  }
}
