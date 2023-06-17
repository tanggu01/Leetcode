class Solution {
    public String reverseWords(String s) {
        int front = s.length()-1, rear = s.length()-1; 
        char[] arr = s.toCharArray();
        StringBuilder res = new StringBuilder();
        while (front >= 0) { //1. 0도 체크해야하니 inclusive
            if (arr[front] == ' ') {
                front--; // 2. 여기서도 front, rear 감소시켜주기
                rear--;
                continue;
            }
            while(front >= 0 && arr[front] != ' ') { //3. 여기서도 front >= 0 체크해주기!!
                front--;
            }
            res.append(String.valueOf(Arrays.copyOfRange(arr,front+1,rear+1))); 
            res.append(" ");
            rear = front;
        }
        return res.toString().trim(); //4. trim 해서 마지막 " "공백 없애주기 
    }
}