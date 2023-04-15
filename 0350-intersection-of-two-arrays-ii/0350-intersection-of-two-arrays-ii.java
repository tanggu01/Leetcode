class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList<>();
        Map<Integer, Integer> hashMap = new HashMap<>();
        
        for (int num : nums1) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        for (int num : nums2) {
            if (hashMap.containsKey(num) && hashMap.get(num) > 0) {
                result.add(num);
                hashMap.put(num, hashMap.get(num) - 1);
            }
        }
        
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;
    }
}
