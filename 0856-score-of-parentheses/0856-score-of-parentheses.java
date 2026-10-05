class Solution {
    public int scoreOfParentheses(String s) {
        int res = 0;
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if (c == '('){
                st.push(0);
            } else {
                int top = st.pop();
                int temp = 1 ;
                if (top != 0){
                    temp = top * 2; 
                } 
                int top2 = st.pop();
                st.push(top2 + temp); 

            }
        }
        return st.pop();
    }
}