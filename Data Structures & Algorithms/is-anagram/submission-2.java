class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);
        String sNew = new String(sArray);
        String tNew = new String(tArray);

         return sNew.equals(tNew);
    }
}
