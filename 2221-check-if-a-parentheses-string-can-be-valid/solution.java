class Solution {
    public boolean canBeValid(String s, String locked) {
        if(s.length()%2!=0){
            System.out.println("0");
            return false;
        }

        Stack<Integer> open = new Stack<>();
        Stack<Integer> unlock = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(locked.charAt(i)=='0'){
                unlock.push(i);
            } else if(s.charAt(i)=='('){
                open.push(i);
            } else if(s.charAt(i)==')'){
                if(!open.isEmpty()){
                    open.pop();
                } else if(!unlock.isEmpty()){
                    unlock.pop();
                } else {
                    System.out.println("1");
                    return false;
                }
            }
        }

        while(!open.isEmpty() && !unlock.isEmpty() && open.peek()<unlock.peek()){
            open.pop();
            unlock.pop();
        }

        if(open.isEmpty() && !unlock.isEmpty()){
            System.out.println("2");
            return unlock.size()%2==0;
        }
        System.out.println("3");
        return open.isEmpty();

    }
}
