package com.carro.leetcode.courses.Arrays101;

public class Inserting_1 {

    public static void main(String[] args) {
        int[] intArray = new int[6];
        int length = 0;

        for (int i = 0; i < 3; i++) {
            intArray[length] = i;
            length++;
        }

        printArray(intArray);

        intArray[length] = 10;
        length++;

        printArray(intArray);

        for (int i = 3; i >= 0; i--) {
            intArray[i + 1] = intArray[i];
        }
        intArray[0] = 20;

        printArray(intArray);

        for (int i = 4; i >= 2; i--) {
            intArray[i + 1] = intArray[i];
        }
        intArray[2] = 30;

        printArray(intArray);
    }

    static void printArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Index " + i + " contains " + intArray[i]);
        }
        System.out.println("\n");
    }
}
