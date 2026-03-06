class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        countingSort(seats);
        countingSort(students);
        int res = 0;
        for(int i=0;i<seats.length;i++){
            res += Math.abs(seats[i] - students[i]);
        }
        return res;
    }
    private void countingSort(int[] arr) {
    int n = arr.length;
    int[] count = new int[101];
    
    for(int i = 0; i < n; i++){
        count[arr[i]]++;
    }
    
    int index = 0;
    for(int i = 0; i <= 100; i++){
        while(count[i] > 0){
            arr[index++] = i;
            count[i]--;
        }
    }
}
}
