class Solution {
    public int maximumProduct(int[] nums) {
        int first, second, third;
        first = second = third = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n > first) {
                third = second;
                second = first;
                first = n;
            } else if (n > second) {
                third = second;
                second = n;
            } else if (n > third) {
                third = n;
            }
        }

        int minFirst = Integer.MAX_VALUE;
        int minSecond = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n < minFirst) {
                minSecond = minFirst;
                minFirst = n;
            } else if (n < minSecond) {
                minSecond = n;
            }
        }
        return Math.max(first * second * third, first * minFirst * minSecond);
    }
}