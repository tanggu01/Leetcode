class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        int maxChild = 0;

        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) { 
                i++;
                j++;
                maxChild++;
            } else {
                j++;
            }
        }
        return maxChild;
    }
}