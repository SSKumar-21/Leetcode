class Solution {
    public String[] findWords(String[] words) {
        String[] key= {"qwertyuiopQWERTYUIOP","asdfghjklASDFGHJKL","zxcvbnmZXCVBNM"};
        ArrayList<String> res = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String str = words[i];
            int k=3;
            for(k=0;k<3;k++){
                if (key[k].contains(String.valueOf(str.charAt(0)))){
                    break;
                }
            }
            if(k<3){
                boolean c=true;
                for(int j=1;j<str.length();j++){
                    if (!key[k].contains(String.valueOf(str.charAt(j)))){
                        c=false;
                        break;
                    }
                }
                if(c){
                    res.add(str);
                }
            }
        }
        String[] result = res.toArray(new String[0]);

        return result;
    }
}
