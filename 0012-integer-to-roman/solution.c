char* intToRoman(int num) {
    int n = num;
    char R[13][3]={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
  int V[]={1,4,5,9,10,40,50,90,100,400 ,500,900,1000};
  int i=12;
  char *ans=(char *)malloc(20*(sizeof(char)));
  ans[0]='\0';
  while(n>0){
      if(V[i]<=n){
        n-=V[i];
        strcat(ans,R[i]);
      }
      else{
        i--;
      }
  }
  
    return ans;
}
