class Solution {
    public int singleNumber(int[] nums) {
        for( int i = 0; i < nums.length; i++){
            boolean notDupe = true;
            for(int j = 0; j < nums.length; j++){
                if(i != j && nums[i] == nums[j]) {
                    notDupe = false;
                    break;
                }
            }
            if(notDupe) {
                return nums[i];
            }
        }
        return -1;
    }
}
