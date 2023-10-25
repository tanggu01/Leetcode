class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        int p1 = 0;
        int p2 = 0;
        StringBuilder str = new StringBuilder();

        while (p1 < l1 || p2 < l2) {
            if (p1 < l1) 
                str.append(word1.charAt(p1++));
            if (p2 < l2)
                str.append(word2.charAt(p2++));
        }
        return str.toString();
    }
}