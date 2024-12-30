class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
         boolean b=false;
         boolean h=false;

    if(length>=10000 || width>=10000 || height>=10000 || length*width>=1000000000/height){
        b=true;
    }
    if(mass>=100){
        h=true;
    }
    if(b && h){
        return "Both";
    } else if(b && !h){
        return "Bulky";
    } else if(!b && h){
        return "Heavy";
    } else{
        return "Neither";
    }
    }
}
