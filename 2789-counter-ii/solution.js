/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let inc=init;
    function increment(){
        return ++inc;
    }
    function decrement(){
        return --inc;
    }
    function reset(){
        inc=init;
        return init;
    }

    return{
        increment: increment,
        decrement: decrement,
        reset: reset
    }
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */
