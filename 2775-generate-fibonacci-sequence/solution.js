/**
 * @return {Generator<number>}
 */
var fibGenerator = function*() {
    let x = 0;
    let y = 1;
    yield x;
    yield y;
    while(true){
        let temp = y;
        y = x+y;
        yield y;
        x = temp;
    }
};

/**
 * const gen = fibGenerator();
 * gen.next().value; // 0
 * gen.next().value; // 1
 */
