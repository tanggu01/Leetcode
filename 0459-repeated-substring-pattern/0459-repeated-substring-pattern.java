class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                int div = n / i;
                String temp = s.substring(0,i).repeat(div);
                if (temp.equals(s)) {   
                    return true;
                }
            } 
        }
        return false;
    }
}