class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>(candyType.length / 2);
        for (int candy : candyType) {
            set.add(candy);
        }
    return Math.min(candyType.length / 2, set.size());
    } 
}