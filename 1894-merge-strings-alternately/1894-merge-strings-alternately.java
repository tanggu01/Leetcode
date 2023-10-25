class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        int p1 = 0;
        int p2 = 0;
        int n = Math.min(l1,l2);
        int i = 0 ;
        StringBuilder str = new StringBuilder();

        while (p1 < n || p2 < n) {
            if (i % 2 == 0) {
                str.append(word1.charAt(p1));
                p1++;
            } else {
                str.append(word2.charAt(p2));
                p2++;
            }
            i++;
        }
        if (p1 < l1){
            str.append(word1.substring(p1, l1));
        } else if (p2 < l2){
            str.append(word2.substring(p2, l2));
        }
        return str.toString();
    }
}