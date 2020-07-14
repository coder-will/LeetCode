package com.day04;

public class FindMedianSortedArrays {
	
	    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        int[] merged = new int[nums1.length + nums2.length];
	        int n1 = 0;
	        int n2 = 0;
	        for (int i = 0; i < merged.length; i++) {
	            if (n2 == nums2.length || (n1 < nums1.length && nums1[n1] <= nums2[n2])) {
	                merged[i] = nums1[n1];
	                n1++;
	            } else {
	                merged[i] = nums2[n2];
	                n2++;
	            }
	        }
	        if (merged.length % 2 != 0) {
	            return merged[merged.length / 2];
	        } else {
	            int r = merged.length / 2;
	            return (double) (merged[r - 1] + merged[r]) / 2;
	        }
	    }
}
