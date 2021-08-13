package com.demotivirus.Day_225;

import java.util.Arrays;

public class LeetCodeTwoSum {
    public static void main(String[] args) {
        //int[] nums = {2, 7, 11, 15};
        //int[] ints = twoSum(nums, 9);
        int[] nums = {3, 2, 4};
        int[] ints = twoSum(nums, 6);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];

        int i = 0;
        int j = i + 1;
        while (i < nums.length) {
            if (nums[i] + nums[j] == target) {
                res[0] = i;
                res[1] = j;
                return res;
            }

            if (j < nums.length - 1) {
                j++;
            }
            else {
                i++;
                j = i + 1;

                if (j == nums.length)
                    break;
            }
        }

        return res;
    }
}
