package com.claireyurev;

class Solution {
  
  private static final Map<String, BiFunction<Integer, Integer, Integer>> OPERATIONS = new HashMap<>();
  
  static {
    OPERATIONS.put("+", (a, b) -> a + b);
    OPERATIONS.put("-", (a, b) -> a - b);
    OPERATIONS.put("*", (a, b) -> a * b);
    OPERATIONS.put("/", (a, b) -> a / b);
  }
  
  public int evalRPN(String[] tokens) {
  
    Deque<Integer> stack = new ArrayDeque<>();
    
    for (String token : tokens) {
      if (!OPERATIONS.containsKey(token)) {
        stack.push(Integer.parseInt(token));
        continue;
      }
      
      var secondNumber = stack.pop();
      var firstNumber = stack.pop();
      
      BiFunction<Integer, Integer, Integer> operation;
      operation = OPERATIONS.get(token);
      
      var result = operation.apply(firstNumber, secondNumber);
      stack.push(result);      
    }
    
    return stack.pop();    
  }

}
