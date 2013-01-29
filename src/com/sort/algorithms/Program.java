package com.sort.algorithms;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import com.sort.algorithms.service.Sortable;
import com.sort.algorithms.service.impl.BidirectionalBubbleSort;
import com.sort.algorithms.service.impl.BubbleSort;
import com.sort.algorithms.service.impl.BucketSort;
import com.sort.algorithms.service.impl.CombSort;
import com.sort.algorithms.service.impl.CombSort11;
import com.sort.algorithms.service.impl.CountingSort;
import com.sort.algorithms.service.impl.EnhancedQuickSort;
import com.sort.algorithms.service.impl.ExtraStorageMergeSort;
import com.sort.algorithms.service.impl.FastQuickSort;
import com.sort.algorithms.service.impl.GnomeSort;
import com.sort.algorithms.service.impl.HeapSort;
import com.sort.algorithms.service.impl.InsertionSort;
import com.sort.algorithms.service.impl.JavaSort;
import com.sort.algorithms.service.impl.MergeSort;
import com.sort.algorithms.service.impl.QuickSort;
import com.sort.algorithms.service.impl.QuickWithBubbleSort;
import com.sort.algorithms.service.impl.RadixSort;
import com.sort.algorithms.service.impl.SelectionSort;
import com.sort.algorithms.service.impl.ShakerSort;
import com.sort.algorithms.service.impl.ShearSort;
import com.sort.algorithms.service.impl.ShellSort;

/**
 * http://www.cs.ubc.ca/~harrison/Java/sorting-demo.html http://home.westman.wave.ca/~rhenry/sort/
 */
public class Program {
  private static int MAX_RANDOM = 1000000;
  private static int MIN_RANDOM = -MAX_RANDOM;
  private static final int CAPACITY = 10000;

  public static void main(String... args) {
    int[] array = getUnsortedArray(CAPACITY);
    List<Sortable> sortingAlgoritms = new LinkedList<>();
    sortingAlgoritms.add(new BidirectionalBubbleSort(getArray(array)));
    // sortingAlgoritms.add(new BogoSort(getArray(array)));
    sortingAlgoritms.add(new BubbleSort(getArray(array)));
    sortingAlgoritms.add(new BucketSort(getArray(array)));
    sortingAlgoritms.add(new CombSort(getArray(array)));
    sortingAlgoritms.add(new CombSort11(getArray(array)));
    sortingAlgoritms.add(new CountingSort(getArray(array), MIN_RANDOM, MAX_RANDOM));
    sortingAlgoritms.add(new EnhancedQuickSort(getArray(array)));
    sortingAlgoritms.add(new ExtraStorageMergeSort(getArray(array)));
    sortingAlgoritms.add(new FastQuickSort(getArray(array)));
    sortingAlgoritms.add(new GnomeSort(getArray(array)));
    sortingAlgoritms.add(new HeapSort(getArray(array)));
    sortingAlgoritms.add(new InsertionSort(getArray(array)));
    sortingAlgoritms.add(new JavaSort(getArray(array)));
    sortingAlgoritms.add(new MergeSort(getArray(array)));
    sortingAlgoritms.add(new QuickSort(getArray(array)));
    sortingAlgoritms.add(new QuickWithBubbleSort(getArray(array)));
    sortingAlgoritms.add(new RadixSort(getArray(array), 8));
    sortingAlgoritms.add(new SelectionSort(getArray(array)));
    sortingAlgoritms.add(new ShakerSort(getArray(array)));
    sortingAlgoritms.add(new ShearSort(getArray(array)));
    sortingAlgoritms.add(new ShellSort(getArray(array)));
    for (Sortable sortable : sortingAlgoritms) {
      try {
        sortAndLog(sortable);
      } catch (ArrayIndexOutOfBoundsException e) {
        if (sortable instanceof RadixSort) {
          System.out.println("Only positive numbers can be in array by Radix sort. Current min=" + MIN_RANDOM);
        }
      } catch (Exception e) {
        e.printStackTrace();
        sortable.logArray("By error");
      }
    }
  }

  private static void sortAndLog(Sortable sortable) throws Exception {
    long time = System.currentTimeMillis();
    sortable.sort();
    time = System.currentTimeMillis() - time;
    sortable.logArray("Sorting takes: " + time);
  }

  private static int[] getArray(int[] array) {
    return array.clone();
  }

  private static int[] getUnsortedArray(int capacity) {
    int[] unsortedArray = new int[capacity];
    Random random = new Random();
    for (int i = 0; i < unsortedArray.length; i++) {
      unsortedArray[i] = random.nextInt(MAX_RANDOM - MIN_RANDOM + 1) + MIN_RANDOM;
    }
    return unsortedArray;
  }
}
