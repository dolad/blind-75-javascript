const power = (base, exp) => {
    if(exp < 0){
        return -1 ;
    }
    if (exp == 0){
        return 1
    }
    return base * power(exp - 1);
}