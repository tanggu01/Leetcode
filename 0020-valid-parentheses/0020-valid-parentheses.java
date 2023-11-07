class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray(); 
        if (arr[0] != '(' && arr[0] != '[' && arr[0] != '{') return false;

        for (char c: arr) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (!stack.isEmpty()){ 
                if (c == ')' && stack.peek() != '(') return false;
                if (c == ']' && stack.peek() != '[') return false;
                if (c == '}' && stack.peek() != '{') return false;
                else stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
