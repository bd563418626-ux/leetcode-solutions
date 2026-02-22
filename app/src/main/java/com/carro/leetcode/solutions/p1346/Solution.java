package com.carro.leetcode.solutions.p1346;

import java.util.HashSet;

class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr) {
            if(set.contains(2 * x) || (x % 2 == 0 && set.contains(x / 2))) {
                return true;
            }
            set.add(x);
        }
        return false;
    }
}
/*
class Solution {
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i != j && arr[i] == 2 * arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
*/
