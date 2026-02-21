package com.carro.leetcode.solutions.p0977;

import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int pos = right;

        while(left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if(leftSquare > rightSquare) {
                result[pos] = leftSquare;
                left++;
            } else {
                result[pos] = rightSquare;
                right--;
            }
            pos--;
        }
        return result;
    }
}

/*
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] squaredNums = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            squaredNums[i] = nums[i] * nums[i];
        }
        Arrays.sort(squaredNums);
        return(squaredNums);
    }
}
*/