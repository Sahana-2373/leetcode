class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        for(int num:prices){
            min = Math.min(min,num);
            int profit = num - min;
            max = Math.max(max,profit);
        }
        return max;
    }
}