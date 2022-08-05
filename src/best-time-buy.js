const maxProfit = function(prices){
    let minVal = Number.MAX_SAFE_INTEGER;
    let maxVal = 0;
    for (let index = 0; index < prices.length; index++) {
        if(prices[index] < minVal ) {
            minVal = prices[index];
        }else if(prices[index] - minVal > maxVal)
            maxVal = prices[index] - minVal;
    }
    return maxVal;
}
console.log(maxProfit([2,4,1]))