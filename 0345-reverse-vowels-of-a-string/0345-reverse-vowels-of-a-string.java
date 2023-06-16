class Solution {
    boolean isVowel(char c) {
        return c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u'
            || c == 'A' || c == 'I' || c == 'E' || c == 'O' || c == 'U';
    }

    public String reverseVowels(String s) {
        char[] res = s.toCharArray();
        int p1 = 0, p2 = s.length() - 1;
        while(p1 < p2) {
            if (isVowel(res[p1]) && isVowel(res[p2])) {
                char temp = res[p1];
                res[p1] = res[p2];
                res[p2] = temp;     
                p1++;
                p2--;  
            }
            else if (isVowel(s.charAt(p1)) && !isVowel(s.charAt(p2))) {
                p2--;
            } else if (!isVowel(s.charAt(p1)) && isVowel(s.charAt(p2))) {
                p1++;
            }
            else {
                p1++;
                p2--;
            }
        }
        return String.valueOf(res);
    }
}