char* winningPlayer(int x, int y) {
    int c=0;
    while(x>0 && y>3){
        c++;
        x--;
        y-=4;
    }
    if(c%2!=0){
        return "Alice";
    }
    return "Bob";
}
