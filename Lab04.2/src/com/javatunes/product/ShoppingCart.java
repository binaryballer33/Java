/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ShoppingCart<T extends Product>{
  // storage for the cart's contents
  private final Collection<T> items = new ArrayList<T>();  // diamond not used here just to emphasize the T
  
  public void addItem(T item) {
    items.add(item);
  }
  
  public void removeItem(T item) {
    items.remove(item);
  }

  public Collection<? extends T> allItems() {
    return Collections.unmodifiableCollection(items);
  }

  public int size() {
    return items.size();
  }

  public double total() {
    double sum = 0;
    for(T item : items) {
      sum += item.getPrice();
    }
    return sum;
  }
}