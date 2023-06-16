class Solution { 
    public String mergeAlternately(String word1, String word2) {
        int i = 0, p1 = 0, p2 = 0;
        int n1 = word1.length(), n2 = word2.length();
        char[] res = new char[n1+n2];
        while (p1 < n1 || p2 < n2) {
            if (p1 < n1) 
                res[i++] = word1.charAt(p1++);
            if (p2 < n2)
                res[i++] = word2.charAt(p2++);
        }
        return String.valueOf(res);
    }
}