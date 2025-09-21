class Solution {
    public int earliestTime(int[][] tasks) {
        if(tasks.length == 1){
            return tasks[0][0] + tasks[0][1];
        }

        int res = tasks[0][0] + tasks[0][1];; 
        for(int i=1;i<tasks.length;i++){
            int check = tasks[i][0] + tasks[i][1];
            if(check<res){
                res = check ;
            }
        }
        return res ;
    }
}
