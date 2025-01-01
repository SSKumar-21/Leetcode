class TimeLimitedCache{
    constructor (){
        this.cache=new Map();
    }
    set(key, value, duration){

        let x=this.cache.get(key);
        if(x){
            clearTimeout(x.time);
        }

        let time = setTimeout(()=>{
            this.cache.delete(key);
        },duration);

        this.cache.set(key,{value,time});
        return  Boolean(x);
    }
    get(key){
        if(this.cache.has(key)){
            return this.cache.get(key).value;
        }
        return -1;
    }
    count(){
        return this.cache.size;
    }
}
