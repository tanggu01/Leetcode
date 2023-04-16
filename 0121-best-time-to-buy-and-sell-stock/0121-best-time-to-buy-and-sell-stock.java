class Solution {
    public int maxProfit(int[] prices) {
        int currMinPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            currMinPrice = Math.min(currMinPrice, prices[i]); //새로운 day 나올때마다 minPrice를 찾고
            maxProfit = Math.max(maxProfit, prices[i] - currMinPrice); //빼보면서 maxProfit 찾기
        } //만약 새로운 날의 Price가 크거나 minPrice가 작아지면 maxProfit 바뀜 
        return maxProfit;
    }
}