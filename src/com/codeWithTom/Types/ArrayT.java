package com.codeWithTom.Types;

import java.util.Arrays;

public class ArrayT {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int[] someArr = new int[5];
        someArr[0] = 0;
        someArr[1] = 1;
        someArr[2] = 2;
        someArr[3] = 3;
        someArr[4] = 4;

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(someArr));

        int[][] nums1 = new int[2][2];
        System.out.println(Arrays.toString(nums1[0]));
        int[][] nums2 = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        System.out.println(Arrays.toString(nums2[0]));
    }
}
