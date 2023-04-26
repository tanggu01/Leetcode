class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int size = s.length();
        char[] arr = new char[size];
        arr = s.toCharArray();

        for (int i = 0; i < size; i++) {
            if (arr[i] == '(' || arr[i] == '[' || arr[i] == '{') {
                stack.push(arr[i]);
            } 
            else if (!stack.isEmpty()){
                if (stack.peek() == '(' && arr[i] == ')') {
                    stack.pop();
                }
                else if (stack.peek() == '[' && arr[i] == ']') {
                    stack.pop();
                }
                else if (stack.peek() == '{' && arr[i] == '}') {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        if (stack.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
}