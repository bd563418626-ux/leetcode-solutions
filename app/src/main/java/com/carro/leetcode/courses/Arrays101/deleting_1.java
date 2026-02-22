package com.carro.leetcode.courses.Arrays101;

public class deleting_1 {

    public static void main(String[] args) {
        int[] intArray = new int[10];

        int length = 0;

        for (int i = 0; i < 6; i++) {
            intArray[length] = i;
            length++;
        }

        printArray(intArray, length);

        for (int i = 1; i < length; i++) {
            intArray[i - 1] = intArray[i];
        }
        length--;
        
         printArray(intArray, length);

    }

    private static void printArray(int[] intArray, int length) {
        for (int i = 0; i < length; i++) {
            System.out.println("Index " + i + " contains " + intArray[i]);
        }
        System.out.println("\n");
    }
}
