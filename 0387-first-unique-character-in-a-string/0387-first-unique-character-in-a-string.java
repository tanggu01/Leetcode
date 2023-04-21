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

// class Solution {
//     public int firstUniqChar(String s) {
//     for(char c : s.toCharArray()){
//         int index = s.indexOf(c);
//         int lastIndex = s.lastIndexOf(c);
//         if(index == lastIndex)
//             return index;
//     }
//         return -1;
//     }
// }

// class Solution {
//     public int firstUniqChar(String s) {
//         Map<Character, Integer> map = new HashMap<>();
//         for (int i = 0; i < s.length(); i++) {
//             map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1); //char, frequency
//         }
//         for (int i = 0; i < s.length(); i++) {
//             if (map.get(s.charAt(i)) == 1) {
//                 return i;
//             }
//         }
//         return -1;
//     }
// }
