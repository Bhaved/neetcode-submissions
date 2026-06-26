class Solution {
    public int maxProfit(int[] prices) {
        
        int smallest = prices[0];
        int max = 0;
        int maxProfit = 0;

        for(int i =0; i < prices.length ;i++){
            
            if( prices[i] > max ){
              max =  prices[i];
            }
            if(prices[i] < smallest ){
              smallest = prices[i];
              max = smallest;
            }
            if(max- smallest > maxProfit){
              maxProfit  = max-smallest;
            }

        }
        return maxProfit;
    }
}
