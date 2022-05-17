package com.claireyurev;
import java.util.*;
import java.util.function.BiFunction;

public class Clear {

    private static final Map<String, BiFunction<Integer, Integer, Integer>> OPERATIONS = new HashMap<>();

    static {
        OPERATIONS.put("+", (a, b) -> a + b);
        OPERATIONS.put("-", (a, b) -> a - b);
        OPERATIONS.put("*", (a, b) -> a * b);
        OPERATIONS.put("/", (a, b) -> a / b);
    }

    public int eval(String[] tokens) {

        Deque<Integer> stack = new ArrayDeque<>();

        for (String token : tokens) {

            if(!OPERATIONS.containsKey(token)) {
                stack.push(Integer.valueOf(token));
                continue;
            }

            int b = stack.pop();
            int a = stack.pop();

            BiFunction<Integer, Integer, Integer> operation;
            operation = OPERATIONS.get(token);

            int result = operation.apply(a, b);
            stack.push(result);
        }

        return stack.pop();
    }
}
