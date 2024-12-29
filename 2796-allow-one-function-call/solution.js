/**
 * @param {Function} fn
 * @return {Function}
 */
var once = function(fn) {
    let call=true; // the fn function should be called once therefore we made a valriable to handle the vatiable
    return function(...args){
        if(call){
            call=false;
            return fn(...args);
        }
        return undefined ;
    }
};

/**
 * let fn = (a,b,c) => (a + b + c)
 * let onceFn = once(fn)
 *
 * onceFn(1,2,3); // 6
 * onceFn(2,3,6); // returns undefined without calling fn
 */

