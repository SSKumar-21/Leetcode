/**
 * The rand7() API is already defined in the parent class SolBase.
 * public int rand7();
 * @return a random integer in the range 1 to 7
 */
class Solution extends SolBase {
    public int rand10() {
        int res = 0;
        while(true){
            int x = rand7();
            int y = (rand7() -1)* 7;
            res = y + x;
            if(res <= 40) {
                res = (res - 1) % 10 + 1;
                break;
            }
        }
        return res;
    }
}
