class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int lastNum1 = m-1;
        // int lastNum2 = n-1;
        int pos = m+n-1;

    //     for (int i = m+n-1; i >= 0; i--) { //Index -1 out of bounds for length 3
    //         if ((nums2[lastNum2] >= nums1[lastNum1]) && lastNum1 >= 0 && lastNum2 >= 0) {
    //             nums1[i] = nums2[lastNum2];
    //             lastNum2--;
    //         } else {
    //             nums1[i] = nums2[lastNum1];
    //             lastNum1--;
    //         }
    //     }
    // }

    //     for (int i = m+n; i > 0; i--) { //Index -1 out of bounds for length 3
    //         if ((nums2[n-1] >= nums1[m-1]) && m > 0 && n > 0) {
    //             nums1[i-1] = nums2[n-1];
    //             n--;
    //         } else {
    //             nums1[i] = nums2[m-1];
    //             m--;
    //         }
    //     }
    // }
        while (m > 0 && n > 0 && pos >= 0) {
            if ((nums2[n-1] >= nums1[m-1])) {
                nums1[pos] = nums2[n-1];
                n--;
                pos--;
            } else {
                int temp = nums1[pos];
                nums1[pos] = nums1[m-1]; 
                nums1[m-1] = temp;
                //nums1[m-1] = 0; //nums1 = [4,5,6,0,0,0] nums2 =[1,2,3]
                m--;
                pos--;
            }   
        }
        if (m == 0 && n > 0) {  //nums1 = [2,0] nums2= [1]; ans = [1,2]
            for (int i = n; i > 0; i--) {
                nums1[i-1] = nums2[i-1]; 
            }
        }
    }
}