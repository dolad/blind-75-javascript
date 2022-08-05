const findMissingNumber = (array) => {
    for(let index = 0; index<array.length; index++){
        if(array[index + 1] - array[index] != 1){
            return array[index] + 1
        }
    }
}

const findMissingNumber2 = (array) => {
    let sumofvalues = 0
    const arrlength = array.length;
    for(let index = 0; index<arrlength; index++){
       sumofvalues += array[index];
    }
    expectedSum = arrlength * ((arrlength + 1) / 2);
    return expectedSum - sumofvalues
}


const arr = [1,2,3,4,5,6,8]
console.log(findMissingNumber2(arr))