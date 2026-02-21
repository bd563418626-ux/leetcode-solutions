package com.carro.leetcode.solutions.p1312;

class Solution {
    public int numberOfSteps(int num) {
        int curNum = num;
        int count = 0;

        while (curNum > 0) {
            boolean isEven = curNum % 2 == 0;
            if (isEven) {
                curNum /= 2;
            } else {
                curNum--;
            }
            count++;
        }
        return count;
    }
}
