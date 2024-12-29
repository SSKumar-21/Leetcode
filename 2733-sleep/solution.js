/**
 * @param {number} millis
 * @return {Promise}
 */
async function sleep(millis) {
        let p1=new Promise((resolve,reject)=>{
            setTimeout(()=>{
                resolve(millis);
            },millis);
        })
        return p1;
    }


/** 
 * let t = Date.now()
 * sleep(100).then(() => console.log(Date.now() - t)) // 100
 */
