class Solution {
    public int firstUniqChar(String s) {
        int ans = Integer.MAX_VALUE;
        for (char c = 'a'; c <= 'z'; c++) {
            int idx = s.indexOf(c); 
            if (idx != -1 && idx == s.lastIndexOf(c) ) {
                ans = Math.min(ans, idx);
            }
        }
        if (ans == Integer.MAX_VALUE) return -1;
        return ans;
    }
}