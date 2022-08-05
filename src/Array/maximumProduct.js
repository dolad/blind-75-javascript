arr = [10,60,80,40,35];
class MaximumProduct {
    maxProduct(nums){
        let max1 = 0;
        let result1 = 0;
        let max2 =0;
        let result2 = 0;
        let resultPair = []
        for(let i = 1; i < nums.length; i++){
            max1 = Math.max(nums[i], nums[i - 1]);
            result1 = Math.max(result1, max1)
            
        }
        resultPair[0] = result1;
        for(let i = 1; i< nums.length; i++){
            let tempMax = 0
            if(nums[i] != resultPair[0]){
                tempMax = Math.max(nums[i], nums[i - 1])
                if( tempMax != resultPair[0]) {
                    max2 = tempMax
                }    
                result2 = Math.max(result2, max2);
            }  
        }
        resultPair[1] = result2;
        return resultPair;
    }
   
}
const maximumProduct = new MaximumProduct();
console.log(maximumProduct.maxProduct(arr));