class Solution {
    public String decodeString(String s) {
         String res="";
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!=']'){
                st.push(c);
            } else {
                String temp="";
                while(!st.isEmpty() && st.peek()!='['){
                    temp=st.pop() + temp;
                }
                if(!st.isEmpty() && st.peek()=='['){
                st.pop();
                }
                
                String num="";
                while(!st.isEmpty() && Character.isDigit(st.peek())){
                    num=st.pop()+num;
                }
                int n=Integer.parseInt(num);
                String w="";
                for(int j=0;j<n;j++){
                    w+=temp;
                }
               for(int j=0;j<w.length();j++){
                   st.push(w.charAt(j));
               }
            }
        }
        while(!st.isEmpty()){
            res=st.pop()+res;
        }
        return res;
    }
}
