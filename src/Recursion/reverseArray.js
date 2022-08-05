const reverseArray = (array) => {
    let newArray = []
    for (let index = 0; index < array.length; index++) {
        newArray[index] = array[array.length - index - 1];        
    }
    return newArray;
}

const reverseArray2 = (array) => {
    for (let index = 0; index < array.length / 2; index++) {
        const others = array.length - index - 1;
        const temp = array[index];
        array[index] = array[others];     
        array[others] = temp;
    }
    return array;
}


console.log(reverseArray2([1,2,3,4,5]))