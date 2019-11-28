//Named functions
function fibon(n){
    if(n===1){
        return [0,1];
    }
    else{
        var s = fibon(n-1);
        s.push(s[s.length-1]+s[s.length-2]);
       
    
    }
    console.log('fibonacci series=',s);

}

fibon(8);