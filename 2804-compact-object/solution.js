/**
 * @param {Object|Array} obj
 * @return {Object|Array}
 */
var compactObject = function(obj) {
    if(obj===null){
        return null;
    }

    if(typeof obj !== "object"){
        return obj;
    }

    if(Array.isArray(obj)){
        return obj.filter(Boolean).map(compactObject);
    }

    const compacted = {};

    for(const key in obj){
        let val=compactObject(obj[key]);
        if(Boolean(val)){
            compacted[key] = val;
        }
    }
    return compacted;
};
