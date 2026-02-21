package com.carro.leetcode.solutions.p1672;

import java.util.Arrays;

class Solution {
    public int maximumWealth(int[][] accounts) {
        return Arrays.stream(accounts)
                     .mapToInt(customer -> Arrays.stream(customer).sum())
                     .max()
                     .getAsInt();
    }
}
/*
class Solution {

    public int maximumWealth(int[][] accounts) {
        int maximumWealth = 0;
        for (int[] customer : accounts) {
            int wealth = 0;
            for (int account : customer) {
                wealth += account;
            }
            return maximumWealth = Math.max(maximumWealth, wealth);
        }
    }
}
*/
