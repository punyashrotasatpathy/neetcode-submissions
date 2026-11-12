class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] nums = new int[m+n];
        System.arraycopy(nums1, 0, nums, 0, m);
        System.arraycopy(nums2, 0, nums, m, n);

        int p = nums.length;
        Arrays.sort(nums);

            if(p % 2 != 0){
                double median = nums[p/2];
                return median;
                
            }
            else{
                double median = (nums[p/2]+nums[p/2 - 1])/2.0;
                return median;
            }
    }
}
