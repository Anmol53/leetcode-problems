/**
 * @author : Anmol Agrawal
 */
/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let profit = 0;
    for(let i = 1; i < prices.length; i++){
        let x = prices[i] - prices[i - 1];
        if(x > 0){
            profit += x;
        }
    }
    return profit;
};