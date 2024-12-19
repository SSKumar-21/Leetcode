class Solution {
    public boolean isValid(String s) {
      char in;
        Stack<Character> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            in=s.charAt(i);

            if(in=='(' || in=='[' || in=='{'){
                st.push(in);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                if( (in==')' && st.peek()=='(') || (in=='}' && st.peek()=='{') || (in==']' && st.peek()=='[') ){
                    st.pop();
                }else{
                    return false;
                }
            }
            }
        
        return st.isEmpty();
    }
}
