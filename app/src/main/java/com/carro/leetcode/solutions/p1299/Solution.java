package com.carro.leetcode.solutions.p1299;

class Solution {

    public int[] replaceElements(int[] arr) {
        int n = arr.length;

        int curMax = -1;

        for (int i = n - 1; i >= 0; i--) {
            int curVal = arr[i];
            arr[i] = curMax;

            if (curVal > curMax) {
                curMax = curVal;
            }
        }
        return arr;
    }
}

/*
class Solution {

    
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int curMax = arr[i + 1];
            for (int j = i + 2; j < n; j++) {
                if (curMax < arr[j]) {
                    curMax = arr[j];
                }
            }
            arr[i] = curMax;
        }
        arr[n - 1] = -1;
        return arr;
    }
}
*/
