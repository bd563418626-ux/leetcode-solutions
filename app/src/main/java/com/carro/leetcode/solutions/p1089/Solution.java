package com.carro.leetcode.solutions.p1089;

// Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.

// Input: arr = [1,0,2,3,0,4,5,0]
// Output: [1,0,0,2,3,0,0,4]

class Solution {
    public void duplicateZeros(int[] arr) {
        int possibleDups = 0;
        int n = arr.length;
        int length = n - 1;

        for (int left = 0; left <= length - possibleDups; left++) {
            if (arr[left] == 0) {
                if (left == length - possibleDups) {
                    arr[length] = 0; 
                    length -= 1;
                    break;
                }
                possibleDups++;
            }
        }

        int last = length - possibleDups; 
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }
    }
}

/*
class Solution {
    public void duplicateZeros(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] == 0) {
                for(int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j-1];
                }
            }
        }
    }
}
*/