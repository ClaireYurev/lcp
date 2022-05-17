package com.claireyurev;

public class Main {

    public static void main(String[] args) {

        String[] testCase01 = {"4", "5", "+"};              // 4 + 5 = 9
        String[] testCase02 = {"10", "4", "5", "+", "-"};   // 10 - 4 + 5 = 1
        String[] testCase03 = {"10", "4", "5", "+", "*"};   // 10 * (4 + 5) = 90
        String[] testCase04 = {"90", "4", "5", "+", "/"};   // 90 / (4 + 5) = 10

        Claire claire = new Claire();
        Clear clear = new Clear();

        System.out.println(claire.eval(testCase04));
        System.out.println(clear.eval(testCase04));
    }
}
