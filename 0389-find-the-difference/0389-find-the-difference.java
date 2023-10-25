class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        int idx = 0;

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("entry.getKey()  + entry.getValue() = " + entry.getKey() + " / /  " + entry.getValue());
        }
        for (int i = 0; i < t.length(); i++) {
            // 없거나 ()null), 0이었거나 (그러면 -1 이 아니라 이다음에 -1)
            if(map.get(t.charAt(i)) == null || map.put(t.charAt(i), map.get(t.charAt(i)) - 1) <= 0) {
                System.out.println(idx);
                idx = i;
                break;
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("entry.getKey()  + entry.getValue() = " + entry.getKey() + " / /  " + entry.getValue());
        }
        System.out.println(map);
        System.out.println(idx);

        return t.charAt(idx);
    }
}