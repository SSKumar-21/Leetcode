int numberOfSteps(int num) {
    int check=0;
    while(num!=0){
        if(num%2==0){
            num/=2;
            check++;
        }
        else{
            num--;
            check++;
        }
    }
    return check;
}
