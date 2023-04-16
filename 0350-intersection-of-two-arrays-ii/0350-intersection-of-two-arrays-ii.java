class Solution {
    /* O(N + M) time, O(N) space complexity 
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
    */


    /**
    If Sorted - two pointer, no space complexity. //O(max(N, M))
    */ 
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> resList = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1] == nums2[p2]) {
                resList.add(nums1[p1]);
                p1++;
                p2++;
            } else if (nums1[p1] > nums2[p2]) {
                p2++;
            } else {
                p1++;
            }
        }
        int[] res = new int[resList.size()];
        for (int i = 0; i < resList.size(); i++){
            res[i] = resList.get(i);
        }
        return res;
    }
}
 