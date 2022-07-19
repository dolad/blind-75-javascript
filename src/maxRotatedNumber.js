var findMin = function(nums) {
    let start = 0;
    let end = nums.length - 1;
    
    while (start < end) {
        let midpoint = Math.floor(start + ((end - start)/ 2));
        if(nums[midpoint] > nums[end]){
            start = midpoint + 1; 
        }
        else if (nums[midpoint] < nums[end]){
            end = midpoint
        }
    }
    return nums[start];

};