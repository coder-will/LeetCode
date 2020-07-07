package com.day01;

public class SumTwoNumber {

}
/**
给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标，你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素
**/

//根据确定的target来找数组中的两个数同时同一个元素不能使用两遍
//思路:1.知道确定的数字之后，我们首先遍历一遍数组，从第一个数开始
//    2.遍历到第一个数之后进行第二轮遍历，遍历数组中剩下的数
//    3.成立的条件是两轮遍历后的两个数相加为target的值
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
