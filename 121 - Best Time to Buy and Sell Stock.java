class Solution {
    public int maxProfit(int[] prices) {
        int minimum = Integer.MAX_VALUE;
        int gain =0;
        int maxGain =0;
        for(int i =0; i<prices.length; i++){
            if(prices[i]<minimum){
                minimum = prices[i];
            }
            gain = prices[i]-minimum;
            if(gain>maxGain ){
                maxGain = gain;
            }
        }
        return maxGain;
    }
}