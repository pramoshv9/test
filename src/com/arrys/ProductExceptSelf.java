package com.arrys;

import java.util.Arrays;

public class ProductExceptSelf {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int n = nums.length;
        int[] output = new int[n];

        // Step 1: Compute left product
        int[] left = new int[n];
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        // Step 2: Compute right product and final result
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] = left[i] * right;
            right *= nums[i];
        }


        System.out.println("Output array: " + Arrays.toString(output));
    }
}