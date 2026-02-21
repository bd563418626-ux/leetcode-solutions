package com.carro.leetcode.solutions.p1295;

class Solution {
    public int findNumbers(int[] nums) {
        int evenCount = 0;
        for(int num : nums) {
            int digit = countDigits(num);
            if(digit % 2 == 0) {
                evenCount += 1;
            }
        }
        return evenCount;
        
    }
    
    private int countDigits(int num) {
        int digit = 0;
        int curNum = num;
        while(curNum > 0) {
            digit++;
            curNum /= 10;
        }
        return digit;
    }
}
