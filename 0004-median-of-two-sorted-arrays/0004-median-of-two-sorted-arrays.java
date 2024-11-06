class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans = merge(nums1, nums2);
        
        if (ans.length % 2 == 0) {
            // Correct calculation for the median in the case of an even number of elements
            return (ans[ans.length / 2] + ans[ans.length / 2 - 1]) / 2.0;
        } else {
            // Return the middle element directly if the length is odd
            return ans[ans.length / 2];
        }
    }

    public int[] merge(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length + arr2.length];
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        // Merging the two sorted arrays
        while (p1 < arr1.length || p2 < arr2.length) {
            int val1 = p1 < arr1.length ? arr1[p1] : Integer.MAX_VALUE;
            int val2 = p2 < arr2.length ? arr2[p2] : Integer.MAX_VALUE;

            if (val1 < val2) {
                arr[p3] = val1;
                p1++;
            } else {
                arr[p3] = val2;
                p2++;
            }
            p3++;
        }

        return arr;
    }
}
