class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res="";
        int i=0,j=0;
        int c=0;
		while(i!=word1.length() && j!=word2.length()){
		    if(c%2==0){
		        res=res+word1.charAt(i);
		        i++;
		    } else{
		        res=res+word2.charAt(j);
		        j++;
		    }
		    c++;
		}
		while(i!=word1.length()){
		    res=res+word1.charAt(i);
		        i++;
		}
		while(j!=word2.length()){
		    res=res+word2.charAt(j);
		        j++;
		}
		return res;
    }
}
