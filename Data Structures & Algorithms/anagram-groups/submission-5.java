class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> sort = new HashMap<>();
        for(String s : strs){
            char[] sArray = s.toCharArray();
            Arrays.sort(sArray);
            String sortedString = new String(sArray);
            sort.putIfAbsent(sortedString, new ArrayList<>());
            sort.get(sortedString).add(s);  
        }
        return new ArrayList<>(sort.values());
    }
}
