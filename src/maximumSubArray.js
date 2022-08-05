function run(a) {
	let current_sum = -Infinity;
	let maximum_sum = -Infinity;

	for(let index = 1; index < a.length; index++){
		current_sum = Math.max(0, current_sum)
		current_sum += a[index];
		maximum_sum = Math.max(maximum_sum,current_sum)
	}
    console.log(maximum_sum);
	return maximum_sum > Math.max(...a) ? maximum_sum : Math.max(...a);
}

const result= run([1,1,1,-1,1,1]);

console.log(result);
