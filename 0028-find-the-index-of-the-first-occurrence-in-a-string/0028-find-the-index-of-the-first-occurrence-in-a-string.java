class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        for (int i = 0; i <= haystack.length() - n; i++) {
            if (haystack.substring(i, i + n).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}