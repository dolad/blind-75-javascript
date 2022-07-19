var maxProduct = function(nums) {
    const maxTill = [nums[0]];
    const minTill = [nums[0]];
    let result = nums[0];
    
     for (let index = 1; index < nums.length; index ++){
         const n = nums[index];
         maxTill[index] = Math.max(n, maxTill[index-1] * n, minTill[index-1] * n);
         minTill[index] = Math.min(n, maxTill[index-1] * n, minTill[index-1] * n);
         result = Math.max(result, maxTill[index])
     }
     
     return result
     
 };

maxProduct([2,3,-2,4])