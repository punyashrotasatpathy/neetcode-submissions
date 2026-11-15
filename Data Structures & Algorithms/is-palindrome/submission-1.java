class Solution {
    public boolean isPalindrome(String s) {
        String strs = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] sArray = strs.toCharArray();
        for(int i = 0; i < sArray.length/2; i++){
            if(sArray[i] != sArray[sArray.length-1-i]){
                return false;
            }
        }
        return true;

    }
}
