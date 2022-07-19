// using hashMaps

/**
 * @param {number[]} nums
 * @return {boolean}
 */
 var containsDuplicate = function(nums) {
    const map = new Map();   
    for(let i = 0; i < nums.length; i++){
        if(map.has(nums[i])){
           return true;
        }else {
          map.set(nums[i], i)
        }
       
    }
    return false
};

// solution 2

/**
 * @param {number[]} nums
 * @return {boolean}
 */
 var containsDuplicate = function(nums) {
    const map = {};
     for(let i = 0; i < nums.length; i++){
         if(map[nums[i]]) {
             return true;
         };
         map[nums[i]] = true;
     }
     return false;
 };