package com.claireyurev;

import java.util.ArrayDeque;
import java.util.Deque;

public class Claire {

    public int eval(String[] input) {

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length; i ++) {

            if (input[i].equals("+"))
                stack.push(stack.pop() + stack.pop());

            else if (input[i].equals("-"))
                stack.push(- stack.pop() + stack.pop());

            else if (input[i].equals("*"))
                stack.push(stack.pop() * stack.pop());

            else if (input[i].equals("/")) {
                int temp = stack.pop();
                stack.push(stack.pop() / temp);
            } else {
                stack.push(Integer.parseInt(input[i]));
            }
        }
        return stack.pop();
    };
}
