/**
 * @param {Array} arr
 * @param {number} depth
 * @return {Array}
 */
var flat = function (arr, n) {
    if(n===0){
        return arr;
    }
    let a=[];
    for(let i=0;i<arr.length;i++){
        if(Array.isArray(arr[i])){
            let temp= flat(arr[i],n-1);
            a.push(...temp);
        }
        else{
            a.push(arr[i]);
        }
    }
    return a;
};
