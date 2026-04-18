class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();
        for( int i =0 ;i< tokens.length;i++){
            String curr = tokens[i];
            if(curr.equals("+") || curr.equals("-") || curr.equals("*") || curr.equals("/")){
                int y = Integer.parseInt(st.pop());
                int x = Integer.parseInt(st.pop());
                int res = 0;
                if(curr.equals("+")) res = x + y;
                if(curr.equals("-")) res = x - y;
                if(curr.equals("*")) res = x * y;
                if(curr.equals("/")) res = x / y;

                st.push(String.valueOf(res));
            } else {
                st.push(tokens[i]);
            }
        }
        return Integer.parseInt(st.peek());
    }
}
