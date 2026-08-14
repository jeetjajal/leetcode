class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int bestbuy= Integer.MAX_VALUE;
        for(int price:prices){
            bestbuy=Math.min(price,bestbuy);
            maxprofit=Math.max( maxprofit,price-bestbuy);
        }
        return maxprofit;
    }
}