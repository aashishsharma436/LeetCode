Question Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock
 
 
// Time complexity is O(n) and space Complexity is O(1)
public int maxProfit(int[] prices) {
  int hold = Integer.MAX_VALUE,sell = 0,rest = 0;
  for(int i = 0; i < prices.length; i++){
    hold = Math.min(hold,prices[i]);
    sell = prices[i] - hold;
    rest = Math.max(rest,sell);
    }
  return rest;
}
