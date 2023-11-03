class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> record = new Stack<>();
        int res = 0;
        
        for (String c : operations) {
            switch(c) {
            case "C" :
                record.pop();
                break;
            case "D" :
                int temp = record.peek();
                record.push(temp * 2);
                break;
            case "+" :
                int c1 =  record.pop();
                int c2 = record.peek();
                record.push(c1);
                record.push(c1 + c2);
                break;
            default:    
                record.push(Integer.parseInt(c));
                break;
            }
        }
        while (!record.isEmpty()) {
            res += record.pop();
        }
        return res;
    }
}