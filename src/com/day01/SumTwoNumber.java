package com.day01;

public class SumTwoNumber {

}
/**
����һ���������� nums ��һ��Ŀ��ֵ target�������ڸ��������ҳ���ΪĿ��ֵ���� ���� ���������������ǵ������±꣬����Լ���ÿ������ֻ���Ӧһ���𰸡����ǣ��㲻���ظ��������������ͬ����Ԫ��
**/

//����ȷ����target���������е�������ͬʱͬһ��Ԫ�ز���ʹ������
//˼·:1.֪��ȷ��������֮���������ȱ���һ�����飬�ӵ�һ������ʼ
//    2.��������һ����֮����еڶ��ֱ���������������ʣ�µ���
//    3.���������������ֱ���������������Ϊtarget��ֵ
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
