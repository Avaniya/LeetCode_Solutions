class Solution {
    public int maxProfit(int[] prices) {
        int cost,profit=0;
        int min=prices[0];
        for(int i=0;i<prices.length;i++){
            cost=prices[i]-min;
            if(cost>profit){
                profit=cost;
            }
            if(min>prices[i]){
                min=prices[i];
            }
        }
        return profit; 
    }
}