int dayOfYear(char* date) {
    int total=0;
    int day[12]={31,28,31,30,31,30,31,31,30,31,30,31};
    int month= (date[5]-'0')*10 + (date[6]-'0')-1;
    for(int i=0;i<month;i++){
        total+=day[i];
    }
    int da=(date[8]-'0')*10 + (date[9]-'0');
    total+=da;
    int year=(date[0]-'0')*1000 + (date[1]-'0')*100 + (date[2]-'0')*10 + (date[3]-'0');
    if((year%4==0 && year%100!=0) || (year%400==0)){
        if(month>1){
        ++total;
        }
    }
    return total;
}
