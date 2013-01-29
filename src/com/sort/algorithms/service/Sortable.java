package com.sort.algorithms.service;

public interface Sortable {
  public abstract void sort() throws Exception;

  public abstract boolean checkSort();

  public abstract void logArray(String message);
}
