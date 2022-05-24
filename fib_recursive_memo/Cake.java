package com.claireyurev;

import java.util.HashMap;

import java.util.Map;

class Cake {
  
  private Map<Integer, Long> memo = new HashMap<>();
  
  public long fib(int n) {
  
    if (n <= 2) // or n < 3
      return 1;
    
    if (memo.containsKey(n))
      return memo.get(n);
    
    var result = fib(n - 1) + fib(n - 2);
     
    memo.put(n, result);
    
    return result;    
  }
  
}
