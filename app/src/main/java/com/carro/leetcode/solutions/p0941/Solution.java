package com.carro.leetcode.solutions.p0941;

class Solution {

    public boolean validMountainArray(int[] arr) {
        int n = arr.length;

        int i = 0;

        if (n < 3)
            return false;

        for (; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                continue;
            } else {
                break;
            }
        }

        if(i == 0 || i == n - 1) {
            return false;
        }

        for (; i < n - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

/*
class Solution {

    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }

        int max = 0;
        int maxIndex = 0;
        int left = 0;
        int right = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        if(maxIndex == 0 || maxIndex == arr.length - 1) {
            return false;
        }
        
        for (int i = 1; i <= maxIndex; i++) {
            if (arr[left] < arr[i]) {
                left++;
            } else {
                return false;
            }
        }

        for (int i = arr.length - 2; i >= maxIndex; i--) {
            if (arr[right] < arr[i]) {
                right--;
            } else {
                return false;
            }
        }
        return true;

    }
}
*/

/*
class Solution {

    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3) {
            return false;
        }
        
        int n = arr.length;
        int i = 0;

        while(i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        if(i == 0 || i == n -1) {
            return false;
        }

        while(i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == n -1;
    }
}
*/

/*
class Solution {

    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }

        int max = 0;
        int maxIndex = 0;
        int left = 0;
        int right = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        if(maxIndex == 0 || maxIndex == arr.length - 1) {
            return false;
        }

        for (int i = 1; i <= maxIndex; i++) {
            if (arr[left] < arr[i]) {
                left++;
            } else {
                return false;
            }
        }

        for (int i = arr.length - 2; i >= maxIndex; i--) {
            if (arr[right] < arr[i]) {
                right--;
            } else {
                return false;
            }
        }
        return true;

    }
}
*/