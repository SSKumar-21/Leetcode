class Solution {
    public boolean areNumbersAscending(String s) {
        int n = 101;
        String[] words = s.split(" ");
        for(String word : words){
            if(isInteger(word)){
                if (n==101){
                    n = Integer.parseInt(word);
                } else {
                    int x = Integer.parseInt(word);
                    if(x>n){
                        n=x;
                    } else{
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean isInteger(String str) {
        if (str == null || str.isEmpty()) return false;
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}