char* categorizeBox(int length, int width, int height, int mass) {
    int b=0,h=0;

    if(length>=10000 || width>=10000 || height>=10000 || length*width>=1000000000/height){
        b=1;
    }
    if(mass>=100){
        h=1;
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
