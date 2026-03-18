class Solution {
    public boolean isValid(String s) {
         Stack<Character> st = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            } else if(!st.empty()){
                char p = st.peek();
                if(c == ')' && p=='('){
                    st.pop();
                } else if(c == '}' && p=='{'){
                    st.pop();
                } else if(c == ']' && p=='['){
                    st.pop();
                }else {
                return false;
            }
            } else {
                return false;
            }
        }
        return st.size() == 0;
    }
}
