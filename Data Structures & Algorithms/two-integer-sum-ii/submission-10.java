class Solution {
    public int[] twoSum(int[] num, int target) {
       int i = 0;
       int j = num.length - 1;
       while (i < j){
        int temp = num[i] + num[j];
        if(temp == target){
            return new int[]{i+1, j+1};
        }
        if(temp > target){
            j--;
        }
        if(temp < target){
            i++;
        }
       }
       return new int[0];
    }
}
