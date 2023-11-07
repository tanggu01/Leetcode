class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (int i = 0; i < word1.length(); i++) {
            arr1[word1.charAt(i) - 'a'] += 1;
        }
        for (int i = 0; i < word2.length(); i++) {
            arr2[word2.charAt(i) - 'a'] += 1;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (Math.abs(arr1[i] - arr2[i]) > 3) {
                return false;
            }
        }
        return true;
    }
}