let num = 10,
factorial = num,
i = 1;

bucleFactorial: while(true){
    if(i === num) break bucleFactorial;
    factorial = factorial * i;
    i++;
}
console.log(factorial);