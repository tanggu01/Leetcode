class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int pos = m+n-1;
        while (p2 >= 0) { //nums2 다 옮길때까지
            if (p1 >= 0 && nums1[p1] >= nums2[p2]) {
               nums1[pos] = nums1[p1];
               p1--;
               pos--;
            } else {
                nums1[pos] = nums2[p2];
                p2--;
                pos--;
            }
        }
    }
}