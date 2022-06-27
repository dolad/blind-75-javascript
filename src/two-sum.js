// using hashMap
const twoSum = function(num, target) {
    let map = new Map();
    for(let i = 0; i < num.length; i++){
        let num2 = target - num[i];
        if(map.has(num2)){
            return [i, map.get(num2)]
        }
        map.set(num[i], i);
    }
}