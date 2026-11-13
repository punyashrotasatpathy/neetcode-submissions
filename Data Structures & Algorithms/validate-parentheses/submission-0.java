class Solution {
    public boolean isValid(String s) {
        if(s.length()%2 != 0){
            return false;
        }
        char[] sArray = s.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : sArray){
            if(c == '('){
                stack.push(')');
            }
            else if(c == '{'){
                stack.push('}');
            }
            else if(c == '['){
                stack.push(']');
            }
            else if(stack.isEmpty() || stack.pop() != c){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
