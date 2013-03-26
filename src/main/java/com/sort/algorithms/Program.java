package com.sort.algorithms;

import com.google.caliper.Param;
import com.google.caliper.Runner;
import com.google.caliper.SimpleBenchmark;
import java.util.Random;

import com.sort.algorithms.impl.BidirectionalBubbleSort;
import com.sort.algorithms.impl.BubbleSort;
import com.sort.algorithms.impl.BucketSort;
import com.sort.algorithms.impl.CocktailSort;
import com.sort.algorithms.impl.CombSort;
import com.sort.algorithms.impl.CombSort11;
import com.sort.algorithms.impl.CountingSort;
import com.sort.algorithms.impl.EnhancedQuickSort;
import com.sort.algorithms.impl.ExtraStorageMergeSort;
import com.sort.algorithms.impl.FastQuickSort;
import com.sort.algorithms.impl.GnomeSort;
import com.sort.algorithms.impl.HeapSort;
import com.sort.algorithms.impl.InsertionSort;
import com.sort.algorithms.impl.JavaSort;
import com.sort.algorithms.impl.MergeSort;
import com.sort.algorithms.impl.QuickSort;
import com.sort.algorithms.impl.QuickWithBubbleSort;
import com.sort.algorithms.impl.RadixSort;
import com.sort.algorithms.impl.SelectionSort;
import com.sort.algorithms.impl.ShakerSort;
import com.sort.algorithms.impl.ShearSort;
import com.sort.algorithms.impl.ShellSort;

/**
 * http://www.cs.ubc.ca/~harrison/Java/sorting-demo.html http://home.westman.wave.ca/~rhenry/sort/
 */
public class Program extends SimpleBenchmark {

   private static final String warmupMillis = "30000";
   private static final String trials = "10";

   public static void main(String... args) {
      Runner.main(Program.class, new String[]{
         "--warmupMillis", warmupMillis,
         "--trials", trials
      });
   }
   
   @Param(value = {"100", "1000", "10000"})
   private int length = 10000;
   public static int MAX_RANDOM = 1000000;
   public static int RADIX_SORT_BITS = 8;
   private int[] values;

   @Override
   protected void setUp() throws Exception {
      values = new int[length];
      Random random = new Random(System.nanoTime());
      for (int i = 0; i < values.length; i++) {
         values[i] = random.nextInt(MAX_RANDOM);
      }
   }

   public void timeBidirectionalBubbleSort(int reps) {
      for (int i = 0; i < reps; i++) {
         BidirectionalBubbleSort.sort(values);
      }
   }

   /*
    public void timeBogoSort(int reps) {
    for (int i = 0; i < reps; i++) {
    BogoSort.sort(values);
    }
    }*/
   public void timeBubbleSort(int reps) {
      for (int i = 0; i < reps; i++) {
         BubbleSort.sort(values);
      }
   }

   public void timeBucketSort(int reps) {
      for (int i = 0; i < reps; i++) {
         BucketSort.sort(values);
      }
   }

   public void timeCocktailSort(int reps) {
      for (int i = 0; i < reps; i++) {
         CocktailSort.sort(values);
      }
   }

   public void timeCombSort(int reps) {
      for (int i = 0; i < reps; i++) {
         CombSort.sort(values);
      }
   }

   public void timeCombSort11(int reps) {
      for (int i = 0; i < reps; i++) {
         CombSort11.sort(values);
      }
   }

   public void timeCountingSort(int reps) {
      for (int i = 0; i < reps; i++) {
         CountingSort.sort(values);
      }
   }

   public void timeEnhancedQuickSort(int reps) {
      for (int i = 0; i < reps; i++) {
         EnhancedQuickSort.sort(values);
      }
   }

   public void timeExtraStorageMergeSort(int reps) {
      for (int i = 0; i < reps; i++) {
         ExtraStorageMergeSort.sort(values);
      }
   }

   public void timeFastQuickSort(int reps) {
      for (int i = 0; i < reps; i++) {
         FastQuickSort.sort(values);
      }
   }

   public void timeGnomeSort(int reps) {
      for (int i = 0; i < reps; i++) {
         GnomeSort.sort(values);
      }
   }

   public void timeHeapSort(int reps) {
      for (int i = 0; i < reps; i++) {
         HeapSort.sort(values);
      }
   }

   public void timeInsertionSort(int reps) {
      for (int i = 0; i < reps; i++) {
         InsertionSort.sort(values);
      }
   }

   public void timeJavaSort(int reps) {
      for (int i = 0; i < reps; i++) {
         JavaSort.sort(values);
      }
   }

   public void timeMergeSort(int reps) {
      for (int i = 0; i < reps; i++) {
         MergeSort.sort(values);
      }
   }

   public void timeQuickSort(int reps) {
      for (int i = 0; i < reps; i++) {
         QuickSort.sort(values);
      }
   }

   public void timeQuickWithBubbleSort(int reps) {
      for (int i = 0; i < reps; i++) {
         QuickWithBubbleSort.sort(values);
      }
   }

   public void timeRadixSort(int reps) {
      for (int i = 0; i < reps; i++) {
         RadixSort.sort(values);
      }
   }

   public void timeSelectionSort(int reps) {
      for (int i = 0; i < reps; i++) {
         SelectionSort.sort(values);
      }
   }

   public void timeShakerSort(int reps) {
      for (int i = 0; i < reps; i++) {
         ShakerSort.sort(values);
      }
   }

   public void timeShearSort(int reps) {
      for (int i = 0; i < reps; i++) {
         ShearSort.sort(values);
      }
   }

   public void timeShellSort(int reps) {
      for (int i = 0; i < reps; i++) {
         ShellSort.sort(values);
      }
   }
   /*
    public void timeStoogeSort(int reps) {
    for (int i = 0; i < reps; i++) {
    StoogeSort.sort(values);
    }
    }*/
}